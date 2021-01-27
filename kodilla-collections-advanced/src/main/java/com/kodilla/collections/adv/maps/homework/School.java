package com.kodilla.collections.adv.maps.homework;

import java.util.ArrayList;
import java.util.List;

public class School {
    private List<Integer> classes = new ArrayList<>();

    public School (Integer... classes) {
        for (Integer clas : classes)
        this.classes.add(clas);
    }

    @Override
    public String toString() {
        return "School{" +
                "classes=" + classes +
                '}';
    }
}
