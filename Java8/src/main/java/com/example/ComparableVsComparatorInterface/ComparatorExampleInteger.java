package com.example.ComparableVsComparatorInterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorExampleInteger {
    public static void main(String[] args) {

        Comparator<Integer> comp = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if(o1%10 > o2%10) return 1;
                return -1;
            }
        };


        List<Integer> nums = new ArrayList<>();
        nums.add(4);
        nums.add(9);
        nums.add(5);
        nums.add(7);

        Collections.sort(nums);
        for(Integer i:nums){
            System.out.println(i);
        }
    }
}
