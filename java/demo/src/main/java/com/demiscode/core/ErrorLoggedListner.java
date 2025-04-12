package com.demiscode.core;

import java.util.UUID;

// @FunctionalInterface
public interface ErrorLoggedListner {
    void onErrorLogged(Object sender, UUID eventId);
}
