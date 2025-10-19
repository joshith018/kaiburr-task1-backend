# Kaiburr - Task 1: Java Backend & REST API

This project is a RESTful API for managing shell command tasks, built with Java, Spring Boot, and MongoDB Atlas.

## How to Run

1.  Ensure you have Java 17 installed.
2.  Clone the repository: `git clone https://github.com/joshith018/kaiburr-task1-backend.git`
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

**1. Create Task (PUT /tasks)**
![Create Task](https://github.com/joshith018/kaiburr-task1-backend/blob/main/Screenshot%202025-10-20%20002137.png)

**2. Get All Tasks (GET /tasks)**
![Get All Tasks](https://github.com/joshith018/kaiburr-task1-backend/blob/main/Screenshot%202025-10-20%20002137.png)

**3. Find by Name (GET /tasks/findByName)**
![Find by Name](https://github.com/joshith018/kaiburr-task1-backend/blob/main/Screenshot%202025-10-20%20002147.png)

**4. Delete Task (DELETE /tasks/{id})**
![Delete Task](https://github.com/joshith018/kaiburr-task1-backend/blob/main/Screenshot%202025-10-20%20002147.png)

---

## Task 4: CI-CD Pipeline (GitHub Actions)

This repository is configured with a GitHub Actions CI pipeline. On every push to the `main` branch, the pipeline automatically:
1.  Checks out the code.
2.  Sets up Java 17.
3.  Performs a "code build" (`mvn package`) and "docker build" using the `Dockerfile`.

### Pipeline Success Screenshot

![GitHub Actions CI Pipeline Success](https://github.com/joshith018/kaiburr-task1-backend/blob/main/Screenshot%202025-10-20%20014743.png)
