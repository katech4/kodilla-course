package com.kodilla.stream.homework;

import com.kodilla.stream.UsersManager;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

public class TaskManager {
    public static void main(String[] args) {
            List<LocalDate> deadline = TaskRepository.getTasks()   // [1]
                    .stream()
                    .filter(u -> u.getDeadline().equals(LocalDate.now()))
                    .map(TaskManager::getTasks)
                    .collect(Collectors.toList());                        // [2]
            System.out.println(deadline);
        }

    private static String getTasks(Task task) {
        return task.getName();
    }
}
