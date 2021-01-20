package com.kodilla.collections.sets.homework;

import java.util.HashSet;
import java.util.Set;

public class StampsApplication {
    public static void main(String[] args) {
        Set<Stamp> stamps = new HashSet<>();
        stamps.add(new Stamp("butterfly", "10x10", "Yes"));
        stamps.add(new Stamp("butterfly", "10x10", "Yes"));
        stamps.add(new Stamp("King", "10x10", "Yes"));
        stamps.add(new Stamp("dog", "8x8", "No"));
        stamps.add(new Stamp("cat", "8x8", "No"));
        stamps.add(new Stamp("cat", "10x10", "Yes"));

        System.out.println(stamps.size());
        for (Stamp stamp : stamps)
            System.out.println(stamp);
    }
}