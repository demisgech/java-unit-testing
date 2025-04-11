package com.demiscode;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Math Tests")
public class MathTests {

    @Test
    public void addWhenCalledShouldReturnTheSumOfArguments() {
        var math = new Math();

        var result = math.add(10, 20);

        assertEquals(30, result);
    }

    @Test
    public void maxWhenCalledShouldReturnTheFirstArgumentIfGereater() {
        var math = new Math();

        var result = math.max(20, 10);

        assertEquals(20, result);
    }

    @Test
    public void maxWhenCalledShouldReturnTheSecondArgumentIfGreater() {
        var math = new Math();

        var result = math.max(10, 20);

        assertEquals(20, result);
    }

    @Test
    public void maxWhenCalledShouldReturnArgumentIfTheyEqual() {
        var math = new Math();

        var result = math.max(10, 10);

        assertEquals(10, result);
    }
}
