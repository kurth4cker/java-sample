// SPDX-License-Identifier: Apache-2.0
// SPDX-FileCopyrightText: 2024 kurth4cker <kurth4cker@gmail.com>

package site.srht.kurth4cker;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class NumberUtilTest {
    @Test
    public void isPrime() {
        record TestCase(int given, boolean expected) {}
        TestCase[] test_cases = {
            new TestCase(-3, false),
            new TestCase(-1, false),
            new TestCase(0, false),
            new TestCase(1, false),
            new TestCase(2, true),
            // TODO
        };

        for (var tc : test_cases) {
            var got = NumberUtil.isPrime(tc.given);
            var message = String.format("given: %d", tc.given);
            assertEquals(tc.expected, got, message);
        }
    }
}
