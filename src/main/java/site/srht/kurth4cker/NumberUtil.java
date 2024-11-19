// SPDX-License-Identifier: Apache-2.0
// SPDX-FileCopyrightText: 2024 kurth4cker <kurth4cker@gmail.com>

package site.srht.kurth4cker;

import java.util.stream.IntStream;

public final class NumberUtil {
    private NumberUtil() {}

    public static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }

        var sqrt = (int)Math.sqrt(num);
        return IntStream.rangeClosed(2, sqrt)
            .noneMatch((val) -> num % val == 0);
    }
}
