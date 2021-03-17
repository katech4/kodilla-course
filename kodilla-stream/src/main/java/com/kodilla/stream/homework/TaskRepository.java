package com.kodilla.stream.homework;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TaskRepository {
    public static List<Task> getTasks() {
        List<Task> tasksList = new ArrayList<>();
        tasksList.add(new Task("Test1", LocalDate.of(2019, 11, 20), LocalDate.now()));
        tasksList.add(new Task("Test2", LocalDate.of(2019, 11, 21), LocalDate.now()));
        return tasksList;
    }
}
