package com.demiscode.exercise1;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class DemeritPointsCalculatorTest {

    private DemeritPointsCalculator calculator;

    @BeforeEach
    public void setup() {
        calculator = new DemeritPointsCalculator();
    }

    @AfterEach
    public void tearDown() {
        calculator = null;
    }

    @Test
    public void calculateDemeritPoints_speedIsNegative_throwIllegalArgumentException() {

        assertThatThrownBy(() -> {
            calculator.calculateDemeritPoints(-10);
        }).isInstanceOf(IllegalArgumentException.class);
    }

    @ParameterizedTest
    @CsvSource({ "0, 0", "5, 0", "65,0", "69, 0", "70,1", "75,2" })
    public void calculateDemeritPoints_whenCalled_returnDemeritPoints(int value, int expected) {
        var result = calculator.calculateDemeritPoints(value);

        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void calculateDemeritPoints_speedIsOver300_throwIllegallArgumentException() {
        assertThatThrownBy(() -> {
            calculator.calculateDemeritPoints(301);
        }).isInstanceOf(IllegalArgumentException.class);
    }
}
