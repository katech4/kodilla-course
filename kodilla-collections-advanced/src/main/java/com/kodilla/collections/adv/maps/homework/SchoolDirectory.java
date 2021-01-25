package com.kodilla.collections.adv.maps.homework;

import java.util.HashMap;
import java.util.Map;

public class SchoolDirectory {
    public static void main(String[] args) {
        Map<Principal, School> school = new HashMap<>();
        Principal john = new Principal("John", "Stevenson");
        Principal jessie = new Principal("Jessie", "Pinkman");
        Principal bart = new Principal("Bart", "Simpson");

        School johnSchool = new School("Szkoła Podstawowa");
        School jessieSchool = new School("Szkoła Gimnazjalna");
        School bartSchool = new School("Szkoła Licealna");

        school.put(john, johnSchool);
        school.put(jessie, jessieSchool);
        school.put(bart, bartSchool);


        for (Map.Entry<Principal, School> principalEntry : school.entrySet())
            System.out.println(principalEntry.getKey().getFirstname() + ", jest dyrektorem w: " +
                    principalEntry.getValue());
    }
}
