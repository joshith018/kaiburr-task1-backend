package com.joshith.Kaiburr.controller;
import com.joshith.Kaiburr.model.Task;
import com.joshith.Kaiburr.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@CrossOrigin("*")
@RestController // Marks this class as a REST API controller
@RequestMapping("/tasks") // All endpoints in this class will start with http://.../tasks
public class TaskController {

    // @Autowired tells Spring to automatically create an instance
    // of your TaskRepository and "inject" it here for you to use.
    @Autowired
    private TaskRepository taskRepository;

    /**
     * Endpoint to create a new task.
     * Maps to: PUT /tasks
     */
    @PutMapping
    public ResponseEntity<Task> createTask(@RequestBody Task task) {
        // A very simple validation to check for potentially dangerous commands.
        // You can make this much stronger later.
        String command = task.getCommand();
        if (command == null || command.contains("rm") || command.contains("mv") || command.contains(":") || command.contains(">") || command.contains("<")) {
            // Returns a 400 Bad Request if the command looks unsafe
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
        
        // Save the new task to the database
        Task savedTask = taskRepository.save(task);
        // Return a 201 Created status with the saved task object
        return ResponseEntity.status(HttpStatus.CREATED).body(savedTask);
    }

    /**
     * Endpoint to get tasks. Can get all tasks or a single task by ID.
     * Maps to: GET /tasks  OR  GET /tasks?id=...
     */
    @GetMapping
    public ResponseEntity<List<Task>> getTasks(@RequestParam(required = false) String id) {
        if (id != null) {
            // If an ID is provided, try to find it
            Optional<Task> task = taskRepository.findById(id);
            if (task.isPresent()) {
                // Found it, return 200 OK with the task in a list
                return ResponseEntity.ok(List.of(task.get()));
            } else {
                // Didn't find it, return 404 Not Found
                return ResponseEntity.notFound().build();
            }
        } else {
            // If no ID is provided, return all tasks
            List<Task> tasks = taskRepository.findAll();
            return ResponseEntity.ok(tasks);
        }
    }

    /**
     * Endpoint to find tasks by name (containing a string).
     * Maps to: GET /tasks/findByName?name=...
     */
    @GetMapping("/findByName")
    public ResponseEntity<List<Task>> findTasksByName(@RequestParam String name) {
        List<Task> tasks = taskRepository.findByNameContaining(name);
        if (tasks.isEmpty()) {
            // Return 404 Not Found if no tasks match
            return ResponseEntity.notFound().build();
        }
        // Return 200 OK with the list of matching tasks
        return ResponseEntity.ok(tasks);
    }

    /**
     * Endpoint to delete a task by its ID.
     * Maps to: DELETE /tasks/{id}
     */
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteTask(@PathVariable String id) {
        if (!taskRepository.existsById(id)) {
            // If the task doesn't exist, return 404 Not Found
            return ResponseEntity.notFound().build();
        }
        taskRepository.deleteById(id);
        // Return 204 No Content to confirm successful deletion
        return ResponseEntity.noContent().build();
    }

    // We will implement the "PUT /taskExecution" endpoint in Task 2,
    // as it requires Kubernetes. We have done all the other parts of Task 1.
}