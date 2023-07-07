package com.example.stream;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ForEachDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("M1");
        list.add("J1");
        list.add("P1");
        list.add("M2");
        list.add("M3");
//
//        list.stream().forEach(t -> System.out.println(t));

//        list.stream().filter(t -> t.startsWith("M")).forEach(t -> System.out.println(t));


        Map<Integer, String> map1 = new HashMap<>();
        map1.put(1,"1");
        map1.put(2,"2");
        map1.put(3,"1");
        map1.put(4,"4");

 //       map1.forEach((key,value) -> System.out.println(key+ " : "+ value));
  //      map1.entrySet().stream().forEach(obj -> System.out.println(obj));
        map1.entrySet().stream().filter(t-> t.getValue().equals("1")).forEach(System.out::println);
    }
}
