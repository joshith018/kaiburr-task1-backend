package com.joshith.Kaiburr.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.List;

@Data
// This tells Spring that this class represents a collection in MongoDB called "tasks".
@Document(collection = "tasks")
public class Task {
    // This marks the 'id' field as the primary key for the database document.
    @Id
    private String id;

    private String name;
    private String owner;
    private String command;
    private List<TaskExecution> taskExecutions;
}