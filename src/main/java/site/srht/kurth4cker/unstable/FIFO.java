// SPDX-License-Identifier: Apache-2.0
// SPDX-FileCopyrightText: 2024 kurth4cker <kurth4cker@gmail.com>

package site.srht.kurth4cker.unstable;

public interface FIFO<E> {
    void add(E e);
    E remove();
}
