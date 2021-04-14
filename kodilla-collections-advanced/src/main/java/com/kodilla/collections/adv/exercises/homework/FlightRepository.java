package com.kodilla.collections.adv.exercises.homework;

import java.util.ArrayList;
import java.util.List;

public class FlightRepository {

    public static List<Flight> Flight(){
        List<Flight> FlightsTable = new ArrayList<>();
        FlightsTable.add(new Flight("Warszawa", "Poznań"));
        FlightsTable.add(new Flight("Kraków", "Poznań"));
        FlightsTable.add(new Flight("Kraków", "Katowice"));
        return FlightsTable;
    }
}
