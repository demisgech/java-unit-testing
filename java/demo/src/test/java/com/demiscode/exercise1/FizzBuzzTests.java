package com.demiscode.exercise1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class FizzBuzzTests {

    @Test
    public void getOutPut_whenInputDivisibleBy3And5_returnFizzBuzz() {
        var result = FizzBuzz.getOutPut(15);

        assertThat(result).isEqualTo("FizzBuzz");
    }

    @Test
    public void getOutPut_whenInputDivisibleBy3Only_returnFizz() {
        var result = FizzBuzz.getOutPut(9);

        assertThat(result).isEqualTo("Fizz");
    }

    @Test
    public void getOutPut_whenInputDivisibleBy5Only_returnBuzz() {
        var result = FizzBuzz.getOutPut(25);

        assertThat(result).isEqualTo("Buzz");
    }

    @Test
    public void getOutPut_whenInputIsNotDivisibleBy3Or5_returnInputAsString() {
        var result = FizzBuzz.getOutPut(7);

        assertThat(result).isEqualTo("7");
    }

    @ParameterizedTest
    @ValueSource(ints = { 15, 9, 25, 7 })
    public void getOutPut_forGivenIntegers_evaluatesFizzBuzzRulesCorrectely(int value) {
        var result = FizzBuzz.getOutPut(value);

        assertThat(result).isIn("FizzBuzz", "Fizz", "Buzz", "7");
    }
}
