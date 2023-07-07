package com.example.streamapiexample;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TaxService {
    public static List<Employee> evaluateTaxUsers(String input){
      // return Database.getEmployees().stream().filter(t -> t.getSalary()>600000).collect(Collectors.toList());

        return
                (input.equalsIgnoreCase("tax"))
                ?
                Database.getEmployees().stream().filter(t -> t.getSalary() > 600000).collect(Collectors.toList()) :
                Database.getEmployees().stream().filter(t -> t.getSalary() <= 600000).collect(Collectors.toList());

    }

    public static List<Employee> sortEmployee(){
        List<Employee> list1 = Database.getEmployees().stream().sorted((emp1, emp2) -> (int) (emp1.getSalary() - emp2.getSalary())).collect(Collectors.toList());

//        Database.getEmployees().stream().sorted(Comparator.comparing(emp -> emp.getSalary())).forEach(System.out::println);
            Database.getEmployees().stream().sorted(Comparator.comparing(Employee::getSalary)).forEach(emp -> System.out.println(emp.getSalary()+ " Line 23"));

            double salaryAsDouble = Database.getEmployees().stream().map(emp -> emp.getSalary()).mapToDouble(i -> i).average().getAsDouble();
        System.out.println(salaryAsDouble);


        return list1;
    }

    public static void main(String[] args) {
        sortEmployee().stream().forEach(emp -> System.out.println(emp.getSalary()));

        evaluateTaxUsers("ftax").stream().forEach(t -> System.out.println(t.getName()));
    }
}
