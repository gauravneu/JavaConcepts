package com.example.mapReduce;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MapReduceExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3,6,7,9,4,6);

       // int sum = 0;
       int sum = numbers.stream().reduce(0,(a,b)-> a+b);
        System.out.println(sum);


        Optional<Integer> reduceSumWithInteger = numbers.stream().reduce(Integer::sum);
        System.out.println(reduceSumWithInteger.get());



        List<String> words = Arrays.asList("corejava", "spring", "hibernate");
        String ans = words.stream().reduce("", (a,b) ->a.length() > b.length() ? a:b);
        System.out.println(ans);



    }
}
