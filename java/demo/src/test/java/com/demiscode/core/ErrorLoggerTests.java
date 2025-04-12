package com.demiscode.core;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class ErrorLoggerTests {

    @Test
    public void log_whenCalled_setTheLastErrorProperty() {
        var logger = new ErrorLogger();
        logger.log("a");

        assertThat(logger.getLastError()).isEqualTo("a");
    }
}
