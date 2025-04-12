package com.demiscode.core;

import java.util.UUID;

public class ErrorLogger {
    private String lastError;

    public ErrorLoggedListner listner;

    public String getLastError() {
        return lastError;
    }

    public void setLastError(String lastError) {
        this.lastError = lastError;
    }

    public void log(String error) {

        if (error == null || error.isEmpty() || error.isBlank())
            throw new IllegalArgumentException("Null error value");

        this.lastError = error;

        // write the log to storage
        // ...

        listner.onErrorLogged(this, UUID.randomUUID());

    }
}
