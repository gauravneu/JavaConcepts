package com.example.map;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EkartDatabase {
    public static List<Customer> getAll(){
        return Stream.of(
                new Customer(101, "john","john@gmail.com", Arrays.asList("8654762","9637582")),
                new Customer(102, "smith","smith@gmail.com", Arrays.asList("3967852","1975325")),
                new Customer(103, "peter","peter@gmail.com", Arrays.asList("4863279","2879645")),
                new Customer(104, "kely","kely@gmail.com", Arrays.asList("3975215","6387549"))
        ).collect(Collectors.toList());
    }
}
