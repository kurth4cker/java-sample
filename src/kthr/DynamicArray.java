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

    public DynamicArray(int capacity)
    {
        if (capacity < 0)
            throw new NegativeArraySizeException("capacity cannot be negative");
        this.array = new Object[capacity];
    }

    public void add(Object obj)
    {
        this.add(this.size, obj);
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

    public int capacity()
    {
        return this.array.length;
    }

    public void clear()
    {
        Arrays.fill(this.array, 0, this.size, null);
        this.size = 0;
    }

    public Object get(int index)
    {
        checkIndex(index);
        return this.array[index];
    }

    public void remove(int index)
    {
        checkIndex(index);

        for (int i = index; i < this.size - 1; i++)
            array[i] = array[i + 1];

        this.array[--this.size] = null;
    }

    public void set(int index, Object obj)
    {
        checkIndex(index);
        this.array[index] = obj;
    }

    public int size()
    {
        return this.size;
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

    public void trimToSize()
    {
        if (this.size != this.array.length)
            this.setCapacity(this.size);
    }
}
