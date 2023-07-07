package com.example.stream.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortListDemo {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        list1.add(8);
        list1.add(3);
        list1.add(12);
        list1.add(4);

//        Collections.sort(list1); //Ascending
//        Collections.reverse(list1);
//        System.out.println(list1);

//        list1.stream().sorted().forEach(s -> System.out.println(s)); //Ascending

//        list1.stream().sorted(Comparator.reverseOrder()).forEach(s -> System.out.println(s)); //descending

    }
}
