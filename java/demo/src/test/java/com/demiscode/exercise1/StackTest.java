package com.demiscode.exercise1;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class StackTest {

    private Stack<Integer> stack;

    @BeforeEach
    public void setup() {
        stack = new Stack<>();
    }

    @AfterEach
    public void tearDown() {
        stack = null;
    }

    @Test
    public void push_argumentIsNull_throwNullPointerException() {

        assertThatThrownBy(() -> {
            stack.push(null);
        }).isInstanceOf(NullPointerException.class);
    }

    @Test
    public void push_withValidArgument_addTheObjectToTheStack() {
        stack.push(1);
        stack.push(2);

        var result = stack.getCount();
        assertThat(result).isGreaterThan(0);
    }

    @Test
    public void getCount_stackIsEmpty_returnZero() {
        var result = stack.getCount();

        assertThat(result).isEqualTo(0);
    }

    @Test
    public void pop_stackIsEmpty_throwUnsupportedOperationException() {

        assertThatThrownBy(() -> {
            stack.pop();
        }).isInstanceOf(UnsupportedOperationException.class);
    }

    @Test
    public void pop_stackIsNotEmpty_returnObjectOnTop() {
        stack.push(1);
        stack.push(2);

        var result = stack.pop();

        assertThat(result).isEqualTo(2);
    }

    @Test
    public void pop_stackIsNotEmpty_removeObjectOnTheTop() {
        stack.push(1);
        stack.push(2);

        stack.pop();
        var count = stack.getCount();

        assertThat(count).isEqualTo(1);
    }

    @Test
    public void peek_stackIsEmpty_throwIndexOutOfBoundsException() {

        assertThatThrownBy(() -> {
            stack.peek();
        }).isInstanceOf(IndexOutOfBoundsException.class);
    }

    @Test
    public void peek_stackIsNotEmpty_doesNotRemoveTheTopObject() {
        stack.push(1);
        stack.push(2);

        stack.peek();

        var count = stack.getCount();

        assertThat(count).isEqualTo(2);
    }

    @Test
    public void peek_stackIsNotEmpty_returnTheTopObject() {
        stack.push(1);
        stack.push(2);

        var result = stack.peek();

        assertThat(result).isEqualTo(2);
    }
}
