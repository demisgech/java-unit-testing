package com.demiscode.core;

import java.util.ArrayList;
import java.util.List;

public class ErrorLogger {
    private String lastError;

    private List<String> logHistory = new ArrayList<>();

    public String getLastError() {
        return lastError;
    }

    public void setLastError(String lastError) {
        this.lastError = lastError;
    }

    public void log(String error) {
        if (error == null)
            throw new NullPointerException();

        this.lastError = error;

        // write the log to storage
        // ...

        logHistory.add(error);

    }
}
