// SPDX-License-Identifier: GPL-3.0-or-later
// SPDX-FileCopyrightText: 2024 kurth4cker <kurth4cker@gmail.com>

package main;

import kthr.SinglyLinkedList;

final class Main {
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();

        for (int i = 0; i < 10; i++) {
            list.addTail(i);
        }
        System.out.println(list);

        for (int i = 0; i < 9; i++)
            list.deleteTail();
        System.out.println(list);
        list.deleteTail();

        System.out.println(list);
    }
}
