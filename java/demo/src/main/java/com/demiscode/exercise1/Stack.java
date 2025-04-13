package com.demiscode.exercise1;

import java.util.ArrayList;
import java.util.List;

public class Stack<T> {
    private final List<T> list = new ArrayList<>();

    private int count = list.size();

    public int getCount() {
        return count;
    }

    public void push(T obj) {
        if (obj == null)
            throw new NullPointerException();
        list.add(obj);
        count++;
    }

    public T pop() {
        if (list.size() == 0)
            throw new UnsupportedOperationException();

        count--;
        return list.removeLast();
    }

    public T peek() {
        return list.get(count - 1);
    }
}
