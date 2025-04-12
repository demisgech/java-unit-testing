package com.demiscode.fundamentals;

public class Calculator {
    public static double add(double x, double y) {
        return x + y;
    }

    public static double getSum(double... numbers) {
        double sum = 0;
        for (double number : numbers) {
            sum += number;
        }
        return sum;
    }
}
