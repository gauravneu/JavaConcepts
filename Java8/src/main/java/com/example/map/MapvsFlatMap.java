package com.example.map;

import java.util.List;
import java.util.stream.Collectors;

public class MapvsFlatMap {

    public static void main(String[] args) {
        List<Customer> customers = EkartDatabase.getAll();
       List<String> emails =  customers.stream().map(customer -> customer.getEmail()).collect(Collectors.toList());
        emails.stream().forEach(em -> System.out.println(em));


        List<String> phNums = customers.stream().flatMap(customer -> customer.getPhoneNumbers().stream()).collect(Collectors.toList());
        phNums.stream().forEach(s -> System.out.println(s));
    }


}
