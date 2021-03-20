package com.kodilla.optional.homework;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Kasia", null));
        studentList.add(new Student("Maciej", null));
        studentList.add(new Student("Michal",null));

        /*Optional<Student> optionalStudent = Optional.ofNullable(/*???nie wiem która zmienna)*/;/*

        optionalStudent.ifPresent(u -> System.out.println(u.getName())); System.out.println(u.getTeacher());
        /*tutaj też nie wiem do końca jakie są opcje wyświtlania....prośba o podpowiedź*/
    }
}
