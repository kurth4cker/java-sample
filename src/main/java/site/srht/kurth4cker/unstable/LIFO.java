// SPDX-License-Identifier: Apache-2.0
// SPDX-FileCopyrightText: 2024 kurth4cker <kurth4cker@gmail.com>

package site.srht.kurth4cker.unstable;

public interface LIFO<E> {
    void push(E e);
    E pop();
}
