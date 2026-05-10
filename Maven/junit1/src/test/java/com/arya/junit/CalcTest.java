package com.arya.junit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class CalcTest {

    @Test
    void testDivide() {
        Calc calc = new Calc();
        assertEquals(2, calc.divide(10, 5));
    }
}