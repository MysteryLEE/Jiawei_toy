package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }


    public static int sum(int[] data) {
        int result = 0;
        for (int value : data) {
            result += value;
        }
        return result;
    }

}