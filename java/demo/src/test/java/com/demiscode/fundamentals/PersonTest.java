package com.demiscode.fundamentals;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class PersonTest {

    @Test
    public void shouldThrowNullPointerExceptionIfUsernameIsNull() {
        assertThrows(NullPointerException.class, () -> {
            new Person(null, 10);
        });
    }

    @Test
    public void shouldReturnUsernameIfItIsNotNull() {
        var person = new Person("Demis", 20);
        assertEquals("Demis", person.getUsername());
    }

    @Test
    public void shouldReturnUpdateUsername() {
        var person = new Person("Demis", 19);
        person.setUsername("John");

        assertEquals("John", person.getUsername());
    }

    @Test
    public void shouldThrowIllegalArgumentExceptionIfAgeIs0() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Person("Demis", 0);
        });
    }

    @Test
    public void shouldThrowIllegalArgumentExceptionIfAgeIsUnder0() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Person("Demis", -1);
        });
    }

    @Test
    public void shouldReturnUpdate() {
        var person = new Person("Demis", 10);

        person.setAge(30);
        var age = person.getAge();

        assertEquals(30, age);
    }

    @Test
    public void shouldReturnFalseIfAgeIsUnder18() {
        var person = new Person("Demis", 17);
        assertFalse(person.isAdult());
    }

    @Test
    public void shouldReturnTrueIfAgeIs18() {
        var person = new Person("Demis", 18);
        assertTrue(person.isAdult());
    }

    @Test
    public void shouldReturnIfAgeIsAbove18() {
        var person = new Person("Demis", 19);
        assertEquals(true, person.isAdult());
    }
}
