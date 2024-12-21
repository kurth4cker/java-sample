// SPDX-License-Identifier: Apache-2.0
// SPDX-FileCopyrightText: 2024 kurth4cker <kurth4cker@gmail.com>

package site.srht.kurth4cker.unstable;

import java.util.Arrays;

public class Stack<E> implements LIFO<E> {
    private static int DEFAULT_INITIAL_CAPACITY = 8;

    private Object[] elements;
    private int size;

    public Stack() {
        this(DEFAULT_INITIAL_CAPACITY);
    }

    private Stack(int capacity) {
        this.elements = new Object[capacity];
    }

    private void ensureCapacity() {
        this.ensureCapacity(this.size + 1);
    }

    private void ensureCapacity(int capacity) {
        if (this.elements.length < capacity) {
            this.elements = Arrays.copyOf(this.elements, capacity);
        }
    }

    public void push(E elem) {
        this.ensureCapacity();
        this.elements[this.size] = elem;
        this.size++;
    }

    public void push(Iterable<? extends E> elements) {
        elements.forEach(this::push);
    }

    @SuppressWarnings("unchecked")
    public E pop() {
        this.size--;
        var elem = (E)this.elements[this.size];
        this.elements[this.size] = null;
        return elem;
    }
}
