package com.joshith.Kaiburr.model;

import java.util.Date;
import lombok.Data;

@Data
public class TaskExecution {
    private Date startTime;
    private Date endTime;
    private String output;
}