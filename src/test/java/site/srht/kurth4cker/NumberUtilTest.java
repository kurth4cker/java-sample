// SPDX-License-Identifier: Apache-2.0
// SPDX-FileCopyrightText: 2024 kurth4cker <kurth4cker@gmail.com>

package site.srht.kurth4cker;

import java.util.stream.Stream;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class NumberUtilTest {
    @Test
    public void isPrime() {
        record TestCase(int given, boolean expected) {
            void assertCase() {
                var got = NumberUtil.isPrime(this.given);
                var message = String.format("given %d", this.given);
                assertEquals(this.expected, got, message);
            }
        }

        TestCase[] test_cases = {
            new TestCase(-3, false),
            new TestCase(-1, false),
            new TestCase(0, false),
            new TestCase(1, false),
            new TestCase(2, true),
            new TestCase(3, true),
            new TestCase(4, false),
            new TestCase(5, true),
            new TestCase(15, false),
            new TestCase(16, false),
            new TestCase(121, false),
        };

        Stream.of(test_cases)
            // .unordered()
            // .parallel()
            .forEach(TestCase::assertCase);
    }
}
