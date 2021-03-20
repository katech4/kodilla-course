package com.kodilla.optional.homework;

import java.util.Optional;

public class Application {
    public static void main(String[] args) {

        Student Kasia = new Student("Kasia", null);

        Optional<Teacher> optionalTeacher = Optional.ofNullable(Kasia.getTeacher());

        Teacher teacher = optionalTeacher.orElse(new Teacher("<undefined>"));
        System.out.println(teacher.getName());

    }
}
