package com.demiscode.core;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.ValueSource;

public class ErrorLoggerTests {

    @Test
    public void log_whenCalled_setTheLastErrorProperty() {
        var logger = new ErrorLogger();

        // Event listner -> subscribe the event
        logger.listner = (sender, eventId) -> {
        };

        logger.log("a");

        assertThat(logger.getLastError()).isEqualTo("a");
    }

    @ParameterizedTest
    @CsvSource({ "null", "''", "' '" })
    public void log_invalidError_throwIllegallArgumentException(String value) {
        var logger = new ErrorLogger();

        String input = "null".equals(value) ? null : value;

        // assertThrows(IllegalArgumentException.class, () -> {
        // logger.log(input);
        // });

        // or

        assertThatThrownBy(() -> {
            logger.log(input);
        }).isInstanceOf(IllegalArgumentException.class);
    }

    // Another way to rewrite the above test code
    @ParameterizedTest
    @NullAndEmptySource
    @ValueSource(strings = { " " })
    public void log_invalidError_throwsException(String value) {
        var logger = new ErrorLogger();

        // JUnit
        assertThrows(IllegalArgumentException.class, () -> {
            logger.log(value);
        });

        // AssertJ
        // assertThatThrownBy(() -> {
        // logger.log(value);
        // }).isInstanceOf(IllegalArgumentException.class);
    }
}
