package com.example.stream.sort;

import java.util.*;
import java.util.Map.Entry;

public class SortMapDemo {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("eight" ,8);
        map.put("four" ,4);
        map.put("ten" ,10);
        map.put("two" ,2);


//        List<Entry<String, Integer>> entries = new ArrayList<>(map.entrySet());
//        Collections.sort(entries, new Comparator<Entry<String, Integer>>() {
//            @Override
//            public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
//                return o1.getValue() - o2.getValue();
//            }
//        });
//
//        entries.stream().forEach(t -> System.out.println(t.getValue()));


    //    map.entrySet().stream().sorted((o1, o2) -> o1.getValue() - o2.getValue()).forEach(e -> System.out.println(e.getValue()));
        map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
        map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
    }
}
