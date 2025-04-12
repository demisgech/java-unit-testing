package com.demiscode.fundamentals;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Factorial Of Number")
public class FactorialOfNumberTest {

    @Test
    public void getFactorialOfShouldReturn1IfGivenArgumentIs0() {
        var fact = new FactorialOfNumber();
        var result = fact.getFactorialOf(0);

        assertEquals(1, result);
    }

    @Test
    public void getFactorialOfShouldReturn1IfGivenArgumentIs1() {
        var fact = new FactorialOfNumber();
        var result = fact.getFactorialOf(1);

        assertEquals(1, result);
    }

    @Test
    public void getFactorialOfShouldReturn2IfGivenArgumentIs2() {
        var fact = new FactorialOfNumber();
        var result = fact.getFactorialOf(2);

        assertEquals(2, result);
    }

    @Test
    public void getFactorialOfShouldReturn6IfGivenArgumentIs3() {
        var fact = new FactorialOfNumber();
        var result = fact.getFactorialOf(3);

        assertEquals(6, result);
    }

    @Test
    public void getFactorialOfShouldReturn24IfGivenArgumentIs4() {
        var fact = new FactorialOfNumber();
        var result = fact.getFactorialOf(4);

        assertEquals(24, result);
    }

    @Test
    public void getFactorialOfShouldReturnTheNumberItselfIfGivenArgumentIsLessThanZero() {
        var fact = new FactorialOfNumber();
        var result = fact.getFactorialOf(-10);
        assertEquals(-10, result);
    }
}
