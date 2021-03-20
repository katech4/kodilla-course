package com.kodilla.optional.homework;

import com.kodilla.stream.User;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Application {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Kasia", "Maciej"));
        studentList.add(new Student("Maciej", "JAn"));
        studentList.add(new Student("Michal",null));

        Optional<Student> optionalStudent = Optional.ofNullable(/*???nie wiem która zmienna*/);

        optionalStudent.ifPresent(u -> System.out.println(u.getName()); System.out.println(u.getTeacher());
        /*tutaj też nie wiem do końca jakie są opcje wyświtlania....prośba o podpowiedź*/
    }
}
