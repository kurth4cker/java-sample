/*
 * SPDX-FileCopyrightText: 2024 kurth4cker <kurth4cker@gmail.com>
 * SPDX-License-Identifier: GPL-3.0-or-later
 */

package kthr;

public final class Sort {
    private Sort()
    {
    }

    public static boolean isSorted(int[] arr)
    {
        for (int i = 0; i < arr.length - 1; i++)
            if (arr[i] > arr[i + 1])
                return false;

        return true;
    }
}
