/*
 * SPDX-FileCopyrightText: 2024 kurth4cker <kurth4cker@gmail.com>
 * SPDX-License-Identifier: GPL-3.0-or-later
 */

package kthr;

import java.util.Arrays;

public final class Vector {
    private Object[] array;
    private int size;

    private int newCapacity()
    {
        return 2 * this.array.length;
    }

    public Vector()
    {
        this(10);
    }

    public Vector(int capacity)
    {
        this.array = new Object[capacity];
    }

    public void add(Object obj)
    {
        this.add(this.size, obj);
    }

    public void add(int index, Object obj)
    {
        Object[] array = this.array;

        if (this.size == this.array.length) {
            array = new Object[this.newCapacity()];
            for (int i = 0; i < index; i++)
                array[i] = this.array[i];
        }

        for (int i = this.size; i > index; i--)
            array[i] = this.array[i - 1];
        array[index] = obj;
        this.array = array;
        this.size++;
    }

    public void clear()
    {
        Arrays.fill(this.array, 0, this.size, null);
        this.size = 0;
    }

    public Object set(int index, Object obj)
    {
        if (index < 0 || index >= this.size) {
            System.err.println("Vector: index out of length");
            System.exit(1);
        }
        Object oldObj = this.array[index];

        this.array[index] = obj;

        return oldObj;
    }

    public void trimToSize()
    {
        this.array = Arrays.copyOf(this.array, this.size);
    }
}
