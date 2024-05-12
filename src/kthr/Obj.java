/*
 * SPDX-FileCopyrightText: 2024 kurth4cker <kurth4cker@gmail.com>
 * SPDX-License-Identifier: GPL-3.0-or-later
 */

package kthr;

class Obj {
    public static void printDynamicType(Object obj)
    {
        System.out.println(obj.getClass().getName());
    }
}
