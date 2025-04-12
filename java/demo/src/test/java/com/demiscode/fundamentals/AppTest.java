package com.demiscode.fundamentals;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class AppTest {
    @Test
    void testName() {

    }

    @Test
    public void shouldAnswerWithTrue() {
        assertEquals(1, 1);
    }

    @Test
    public void shouldAddTwoNumber() {
        assertEquals(10, Calculator.add(3, 7));
    }

    @Test
    public void shouldReturnCorrectSumOfNumbers() {
        assertEquals(10, Calculator.getSum(1, 3, 4, 2));
        assertEquals(20, Calculator.getSum(10, 10.0));
    }

}
