package com.example.java8;

interface Calculator {
    //    void switchOn();
//    void sum(int input);
    int substract(int i1, int i2);
}

public class CalculatorImpl { // no need to write implements here
    // (input) -> {Method body}

    public static void main(String[] args) {
        //Without return type and argument
//      Calculator calculator =  () -> {
//            System.out.println("Hello");
//        };
//      calculator.switchOn();


        // Without return type and single argument
//     Calculator calculator =   (input) -> {
//            System.out.println("sum : "+ input);
//        };
//    calculator.sum(3);

        //With return type and arguments

        Calculator calculator = (i1, i2) -> {
            return i1 - i2;
        };
        System.out.println(calculator.substract(4, 7));
    }


}

