package com.demiscode.fundamentals;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Reservation Test")
public class ReservationTest {

    @Test
    public void canBeCancelledByShouldReturnTrueIfReservationIsCancelledByAdminUser() {
        // AAA
        // Arrange
        var reservation = new Reservation();

        // Act
        var user = new User();
        user.setAdmin(true);

        var result = reservation.canBeCancelledBy(user);

        // Assert
        assertEquals(true, result);
    }

    @Test
    public void canBeCancelledByShouldReturnTrueIfReservationIsCancelledByTheSameUser() {

        var reservation = new Reservation();
        var user = new User();
        reservation.setMadeByUser(user);

        var result = reservation.canBeCancelledBy(user);
        assertTrue(result);
    }

    @Test
    public void canBeCancelledByShouldReturnFalseIfReservationIsCancelledByAnotherUser() {
        var reservation = new Reservation();
        reservation.setMadeByUser(new User());

        var result = reservation.canBeCancelledBy(new User());

        assertFalse(result);
    }
}
