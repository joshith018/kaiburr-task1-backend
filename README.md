# Kaiburr - Task 1: Java Backend & REST API

This project is a RESTful API for managing shell command tasks, built with Java, Spring Boot, and MongoDB Atlas.

## How to Run

1.  Ensure you have Java 17 installed.
2.  Clone the repository: `git clone <your-repo-url>`
3.  Navigate to `src/main/resources/application.properties` and replace the MongoDB URI with your own.
4.  Run the application using VS Code's "Run" button on `KaiburrApplication.java` or by running `mvn spring-boot:run` in the terminal.
5.  The application will be available at `http://localhost:8080` (or your configured port).

## API Endpoints

* **Create Task:** `PUT /tasks`
* **Get All Tasks:** `GET /tasks`
* **Get Task by ID:** `GET /tasks?id={id}`
* **Find Tasks by Name:** `GET /tasks/findByName?name={name}`
* **Delete Task:** `DELETE /tasks/{id}`

---

## Postman Screenshots

*You must add your screenshots here!*

**1. Create Task (PUT /tasks)**


**2. Get All Tasks (GET /tasks)**


**3. Find by Name (GET /tasks/findByName)**


**4. Delete Task (DELETE /tasks/{id})**