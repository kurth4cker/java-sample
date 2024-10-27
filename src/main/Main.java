// SPDX-License-Identifier: GPL-3.0-or-later
// SPDX-FileCopyrightText: 2024 kurth4cker <kurth4cker@gmail.com>

package main;

import kthr.SList;

final class Main {
    public static void main(String[] args) {
        SList list = new SList();

        for (int i = 0; i < 10; i++) {
            list.addTail(i);
            System.out.println(list);
        }

        for (int i = 0; i < 4; i++) {
            list.deleteTail();
            System.out.println(list);
        }

        for (int i = 0; i < 4; i++) {
            list.deleteHead();
            System.out.println(list);
        }

        System.out.println(list);
    }
}
