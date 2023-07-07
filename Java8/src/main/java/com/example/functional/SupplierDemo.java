package com.example.functional;

import java.util.Arrays;
import java.util.List;

public class SupplierDemo {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(2,3,4,5);
        System.out.println(list1.stream().filter(t -> t%2 !=0).findAny().orElseGet( () -> 1));
    }
}
