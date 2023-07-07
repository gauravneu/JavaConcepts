package com.example.generic;

public class GenericDemo<T> {
    T data[] =(T[]) new Object[34];

    public static void main(String[] args) {
        GenericDemo<String> st = new GenericDemo<>();
    }
 }
