package com.demiscode.fundamentals;

import java.util.ArrayList;
import java.util.List;

public class Math {

    public double add(double a, double b) {
        return a + b;
    }

    public double max(double a, double b) {
        return (a > b) ? a : b;
    }

    public boolean isOdd(int number) {
        return number % 2 == 1;
    }

    public List<Integer> getOddNumbers(int limit) {
        List<Integer> oddNumbers = new ArrayList<>();
        for (var i = 0; i <= limit; i++)
            if (i % 2 != 0)
                oddNumbers.add(i);
        return oddNumbers;
    }
}
