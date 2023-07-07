package com.example.functional;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

//public class ConsumerDemo implements Consumer<Integer> {
//
//    @Override
//    public void accept(Integer integer) {
//        System.out.println("Printing : " + integer);
//    }
//
//    public static void main(String[] args) {
//
//    }
//}

public class ConsumerDemo {
    public static void main(String[] args) {
//        Consumer consumer = (t) -> System.out.println("Printing : " + t);
//        consumer.accept(10);

//        List<Integer> list1 = Arrays.asList(1,2,3,4,5);
////        list1.forEach(System.out::println);
//            list1.stream().forEach(consumer);
//        }

        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
//        list1.stream().forEach(t -> System.out.println("Print : " + t));
        list1.forEach(t -> System.out.println("Print : " + t)); // this accepts consumer functional interface

    }

}