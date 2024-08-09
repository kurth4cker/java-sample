// SPDX-License-Identifier: GPL-3.0-or-later
// SPDX-FileCopyrightText: 2024 kurth4cker <kurth4cker@gmail.com>

package kthr;

final class Property {
    public static void print(String property) {
        System.out.printf("%s = %s", property, System.getProperty(property));
    }

    public static void println(String property) {
        print(property);
        System.out.println();
    }
}
