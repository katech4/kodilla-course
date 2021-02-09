package com.kodilla.collections.adv.maps.homework;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SchoolDirectory {
    public static void main(String[] args) {
        Map<Principal, School> school = new HashMap<>();
        Principal john = new Principal("John", "Stevenson");
        Principal jessie = new Principal("Jessie", "Pinkman");
        Principal bart = new Principal("Bart", "Simpson");

        List<Integer> classesJhonSchool = List.of(1,2,3,4,10);
        List<Integer> classesJessieSchool = List.of(10,20,30,50,15);
        List<Integer> classesBartSchool = List.of(5, 15, 25, 35, 45);

        School johnSchool = new School (classesJhonSchool);
        School jessieSchool = new School(classesJessieSchool);
        School bartSchool = new School(classesBartSchool);


        school.put(john, johnSchool);
        school.put(jessie, jessieSchool);
        school.put(bart, bartSchool);


        for (Map.Entry<Principal, School> principalEntry : school.entrySet())
            System.out.println(principalEntry.getKey().getFirstname() + ", jest dyrektorem w: " +
                    principalEntry.getValue());
    }
}
