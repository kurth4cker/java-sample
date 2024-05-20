// SPDX-FileCopyrightText: 2024 kurth4cker <kurth4cker@gmail.com>
// SPDX-License-Identifier: GPL-3.0-or-later

package kthr;

import java.util.Arrays;

public final class DynamicArray {
    private static final int DEFAULT_CAPACITY = 10;

    private Object[] array;
    private int size;

    private void checkIndex(int index)
    {
        if (index < 0 || index >= this.size)
            throw new ArrayIndexOutOfBoundsException(index);
    }

    private void setCapacity(int capacity)
    {
        assert capacity >= 0;
        this.array = Arrays.copyOf(this.array, capacity);
    }

    public DynamicArray()
    {
        this.array = new Object[DEFAULT_CAPACITY];
    }

    public void add(int index, Object obj)
    {
        checkIndex(index + 1);
        if (this.size == this.array.length)
            this.setCapacity(this.size * 2);

        for (int i = this.size; i > index; i--)
            this.array[i] = this.array[i - 1];

        this.array[index] = obj;
        this.size++;
    }

    public Object get(int index)
    {
        checkIndex(index);
        return this.array[index];
    }

    public String toString()
    {
        StringBuilder sb = new StringBuilder();

        sb.append('[');
        for (int i = 0; i < this.size - 1; i++) {
            sb.append(this.array[i]);
            sb.append(", ");
        }
        sb.append(this.array[this.size - 1]);
        sb.append(']');

        return sb.toString();
    }
}
