package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public static double entropy(double[] values) {
        double entropy = 0;
        int total = 0;
        for (double value : values) {
            if (value > 0) {
                entropy += value * Math.log(value);
                total++;
            }
        }
        if (total > 0) {
            entropy = -entropy / Math.log(total);
        }
        return entropy;
    }

}