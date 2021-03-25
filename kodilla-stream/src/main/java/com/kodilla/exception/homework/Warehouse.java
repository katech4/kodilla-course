package com.kodilla.exception.homework;

import java.util.ArrayList;
import java.util.List;

public class Warehouse {
    public static List<Order> getOrder() {
        List<Order> orderList = new ArrayList<>();
        orderList.add(new Order("111"));
        orderList.add(new Order("222"));
        orderList.add(new Order("333"));
        return orderList;


      /* String order = Order.getOrder(String number)
                .stream()
                .map(u -> u.getNumber())
                .mapToInt(n -> n)
                .average()
                .getAsDouble();
        System.out.println(number);*/

    }
}