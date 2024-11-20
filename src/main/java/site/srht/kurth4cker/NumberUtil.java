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

        if (num % 2 == 0) {
            return num == 2;
        }

        return IntStream.iterate(3, i -> i * i <= num, i -> i + 2)
            .noneMatch(i -> num % i == 0);
    }
}
