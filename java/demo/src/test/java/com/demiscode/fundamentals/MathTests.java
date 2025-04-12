package com.demiscode.fundamentals;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

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

    // Parametrized Test

    @ParameterizedTest
    @ValueSource(ints = { 1, 3, 5 })
    public void isOddWhenCalledShouldReturnTrueIfGivenValueSatisfiesTheCondition(int number) {
        var result = math.isOdd(number);

        assertTrue(result);
    }

    @ParameterizedTest
    @CsvSource({ "1, 2, 3", "-3,4,1", "10,20,30" })
    public void addWhenCalledShouldReturnSumOfArguments(double a, double b, double expected) {
        var result = math.add(a, b);

        assertEquals(expected, result);
    }

    @ParameterizedTest
    @CsvSource({ "2,1,2", "1,2,2", "1,1,1" })
    public void maxWhenCalledShouldReturnGreaterArgument(double a, double b, double expected) {
        var result = math.max(a, b);

        assertEquals(expected, result);
    }

    // Disabling Test
    @Test
    @Disabled("Because I wanted to!")
    public void disabled() {
        System.out.println("Disabled test");
    }

    // Trustworthy test
    // it's a test that give the right value
    // it is a test that test the right behavior not implementation

    @Test
    public void trustworthyTest() {
        assertNotNull(math); // Not a trustworthy test
        var result = 1 + 2;
        assertEquals(3, result); // Testing the right behavior
    }

    @Test
    public void getOddNumbers_LimitIsGreaterThanZero_ReturnOddNumbersUpToLimit() {
        var result = math.getOddNumbers(5);

        assertThat(result).isNotEmpty(); // Too general

        assertThat(result).containsExactly(1, 3, 5); // too specific
        // assertThat(result).containsExactly(3, 1, 5); // fail cause it is too specific

        // better
        assertThat(result).contains(3, 1, 5);
        assertThat(result.size()).isEqualTo(3);

        // assertThat(result).isSorted(); // check if it is sorted
    }
}
