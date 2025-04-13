package com.demiscode.exercise1;

public class DemeritPointsCalculator {
    private final int speedLimit = 65;
    final private int MAX_SPEED = 300;
    final private int MIN_SPEED = 0;

    public int calculateDemeritPoints(int speed) {
        if (speed < MIN_SPEED || speed > MAX_SPEED)
            throw new IllegalArgumentException();

        if (speed <= speedLimit)
            return 0;

        final int kmPerDemeritPoint = 5;
        var demeritPoint = (speed - speedLimit) / kmPerDemeritPoint;
        return demeritPoint;
    }
}
