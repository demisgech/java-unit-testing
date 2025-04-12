package com.demiscode.fundamentals;

public class FactorialOfNumber {
    public int getFactorialOf(int number) {
        if (number < 0)
            return number;
        if (number == 0 || number == 1)
            return 1;
        return getFactorialOf(number - 1) * number;
    }
}
