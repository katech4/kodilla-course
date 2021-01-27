package com.kodilla.collections.adv.maps.homework;

import java.util.HashMap;
import java.util.Map;

public class SchoolDirectory {
    public static void main(String[] args) {
        Map<Principal, School> school = new HashMap<>();
        Principal john = new Principal("John", "Stevenson");
        Principal jessie = new Principal("Jessie", "Pinkman");
        Principal bart = new Principal("Bart", "Simpson");

        School johnSchool = new School (10);
        School jessieSchool = new School(20);
        School bartSchool = new School(30);


        school.put(john, johnSchool);
        school.put(jessie, jessieSchool);
        school.put(bart, bartSchool);


        for (Map.Entry<Principal, School> principalEntry : school.entrySet())
            System.out.println(principalEntry.getKey().getFirstname() + ", jest dyrektorem w: " +
                    principalEntry.getValue());
    }
}
