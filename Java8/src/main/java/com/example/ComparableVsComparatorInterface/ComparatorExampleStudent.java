package com.example.ComparableVsComparatorInterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student{
    int age;
    String name;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Student{");
        sb.append("age=").append(age);
        sb.append(", name='").append(name).append('\'');
        sb.append('}');
        return sb.toString();
    }
}

public class ComparatorExampleStudent {


    public static void main(String[] args) {

//        Comparator<Student> comp = new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                if(o1.age%10 > o2.age%10) return 1;
//                return -1;
//            }
//        };


        //Same above using lambda:
        Comparator<Student> comp = (o1,o2) -> o1.age > o2.age ? 1: -1;


        List<Student> studs = new ArrayList<>();
        studs.add(new Student(12,"a1"));
        studs.add(new Student(16,"1e"));
        studs.add(new Student(17,"5r"));
        studs.add(new Student(13,"rj"));

//Here comparator need to be passed
        //Comparator is required because Student class doesn't tell how to sort.
        //However, Integer class implements Comparable interface, and it tells how to sort
        Collections.sort(studs,comp);

        for(Student st: studs){
            System.out.println(st);
        }

    }
}
