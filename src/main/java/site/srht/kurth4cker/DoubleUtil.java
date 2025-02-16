// SPDX-License-Identifier: Apache-2.0
// SPDX-FileCopyrightText: 2025 kurth4cker <kurth4cker@gmail.com>

package site.srht.kurth4cker;

public final class DoubleUtil {
    private DoubleUtil() {}

    private static double epsilon = 0.000_001;

    public static boolean isEqual(double a, double b) {
        return isEqual(epsilon, a, b);
    }

    public static boolean isEqual(double epsilon, double a, double b) {
        return Math.abs(a - b) < epsilon;
    }
}
