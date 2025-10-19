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



**1. Create Task (PUT /tasks)**
(https://github.com/joshith018/kaiburr-task1-backend/blob/main/Screenshot%202025-10-20%20002137.png)
**2. Get All Tasks (GET /tasks)**
(https://github.com/joshith018/kaiburr-task1-backend/blob/main/Screenshot%202025-10-20%20002137.png)
**3. Find by Name (GET /tasks/findByName)**
(https://github.com/joshith018/kaiburr-task1-backend/blob/main/Screenshot%202025-10-20%20002147.png)
**4. Delete Task (DELETE /tasks/{id})**
<<<<<<< HEAD
(https://github.com/joshith018/kaiburr-task1-backend/blob/main/Screenshot%202025-10-20%20002147.png)
=======
https://github.com/joshith018/kaiburr-task1-backend/blob/main/Screenshot%202025-10-20%20002147.png
>>>>>>> 20e35fad770d4a5b409d4a33dfb9e26f46b9de4c

---

## Task 4: CI-CD Pipeline (GitHub Actions)

This repository is configured with a GitHub Actions CI pipeline. On every push to the `main` branch, the pipeline automatically:
1.  Checks out the code.
2.  Sets up Java 17.
3.  Performs a "code build" (`mvn package`) and "docker build" using the `Dockerfile`.

### Pipeline Success Screenshot

![GitHub Actions CI Pipeline Success](---

## Task 4: CI-CD Pipeline (GitHub Actions)

This repository is configured with a GitHub Actions CI pipeline. On every push to the `main` branch, the pipeline automatically:
1.  Checks out the code.
2.  Sets up Java 17.
3.  Performs a "code build" (`mvn package`) and "docker build" using the `Dockerfile`.

### Pipeline Success Screenshot

![GitHub Actions CI Pipeline Success](---

## Task 4: CI-CD Pipeline (GitHub Actions)

This repository is configured with a GitHub Actions CI pipeline. On every push to the `main` branch, the pipeline automatically:
1.  Checks out the code.
2.  Sets up Java 17.
3.  Performs a "code build" (`mvn package`) and "docker build" using the `Dockerfile`.

### Pipeline Success Screenshot

![GitHub Actions CI Pipeline Success](https://github.com/joshith018/kaiburr-task1-backend/blob/main/Screenshot%202025-10-20%20014743.png))
