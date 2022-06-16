package com.thealgorithms.maths;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AmicableNumberTest {

    @Test
    void TestAmicableTwoPositivesTrue() {
        assertTrue(AmicableNumber.isAmicableNumber(10744, 10856));
    }

    @Test
    void TestAmicableTwoPositivesFalse() {
        assertFalse(AmicableNumber.isAmicableNumber(1184, 1211));
    }

    @Test
    void TestAmicableTwoLowNumber() {
        assertEquals(false, AmicableNumber.isAmicableNumber(100, Integer.MAX_VALUE));
    }

    @Test
    void TestAmicableOneZeroResult() {
        assertEquals(false, AmicableNumber.isAmicableNumber(1, 1));
    }

}
