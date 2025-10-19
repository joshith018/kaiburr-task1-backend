package com.joshith.Kaiburr.repository;
import com.joshith.Kaiburr.model.Task;
import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.List;

// This is an interface, not a class.
// By extending MongoRepository, we get all the standard database methods
// (save(), findById(), findAll(), deleteById()) for free!
// We tell it to manage 'Task' objects, and their ID is a 'String'.
public interface TaskRepository extends MongoRepository<Task, String> {

    // This is a custom method. Spring Data is smart enough to understand
    // the method name and automatically create a query that finds all Tasks
    // where the 'name' field contains the text we pass in.
    List<Task> findByNameContaining(String name);
}