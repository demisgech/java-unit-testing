package com.demiscode;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Math Tests")
public class MathTests {

    private Math math;

    // Setup -> before test execution
    @BeforeAll
    public static void InitAll() {
        System.out.println("Before all test");
        System.out.println("Applied on Static Methods");
    }

    @BeforeEach
    public void init() {
        math = new Math();
        System.out.println("Before Each Test");
        System.out.println("Applied on Instance fields");
    }

    // TearDown -> after test execution
    @AfterEach
    public void tearDown() {
        math = null;
        System.out.println("Afeter Each Test");
        System.out.println("Applied on Instance fields");
    }

    @AfterAll
    static public void killAll() {
        System.out.println("After All Tests");
        System.out.println("Applide on static fieds");
    }

    @Test
    public void addWhenCalledShouldReturnTheSumOfArguments() {
        var result = math.add(10, 20);

        assertEquals(30, result);
    }

    @Test
    public void maxWhenCalledShouldReturnTheFirstArgumentIfGereater() {
        var result = math.max(20, 10);

        assertEquals(20, result);
    }

    @Test
    public void maxWhenCalledShouldReturnTheSecondArgumentIfGreater() {
        var result = math.max(10, 20);

        assertEquals(20, result);
    }

    @Test
    public void maxWhenCalledShouldReturnArgumentIfTheyEqual() {
        var result = math.max(10, 10);

        assertEquals(10, result);
    }

}
