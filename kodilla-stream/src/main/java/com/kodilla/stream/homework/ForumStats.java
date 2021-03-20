package com.kodilla.stream.homework;

import com.kodilla.stream.UsersRepository;

public class ForumStats {
    public static void main(String[] args) {
        double NumberOfPost = UsersRepository.getUsersList()
                .stream()
                .map(u -> u.getNumberOfPost())
                .mapToInt(n -> n)
                .average()
                .getAsDouble();
        //czy tutaj i w jakiej formie można zrobić pętle ???
        // user.age >= 40;         System.out.println(NumberOfPost));
        //user.age <40
    }
}
