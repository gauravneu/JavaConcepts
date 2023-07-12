package com.example.ComparableVsComparatorInterface;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
//Using this comparison logic is moved to Student class
class Student1 implements Comparable<Student1>{

    int age;
    String name;

    public Student1(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Student1{");
        sb.append("age=").append(age);
        sb.append(", name='").append(name).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public int compareTo(Student1 that) {
       return Integer.compare(this.age,that.age);
    }



}

public class ComparableExample {
    public static void main(String[] args) {
        List<Student1> stuComp = new ArrayList<>();

        stuComp.add(new Student1(12,"a1"));
        stuComp.add(new Student1(16,"1e"));
        stuComp.add(new Student1(17,"5r"));
        stuComp.add(new Student1(13,"rj"));

        Collections.sort(stuComp);

        for(Student1 s1:stuComp){
            System.out.println(s1);
        }
    }
}


