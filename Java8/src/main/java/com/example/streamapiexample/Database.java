package com.example.streamapiexample;

import java.util.ArrayList;
import java.util.List;

public class Database {
    public static List<Employee> getEmployees(){
        List<Employee> list1 = new ArrayList<>();
        list1.add(new Employee(176,"Ro1","IT", 600000));
        list1.add(new Employee(265,"Bo1","Civil", 900000));
        list1.add(new Employee(650,"Ho1","Defence", 1200000));
        list1.add(new Employee(792,"Ro2","Core",7500000));
        list1.add(new Employee(067,"Ro6","Infra", 360000));
        return list1;
    }
 }
