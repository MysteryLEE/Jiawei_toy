package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public static float Sum(float[] data) {

        float sum = 0;

        for (int i = 0; i < data.length; i++) {

            sum += data[i];

        }

        return sum;

    }

}