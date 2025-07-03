package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TriangleNumberCalculatorTest {

    @Test
    void testValue() {
        TriangleNumberCalculator calculator = new TriangleNumberCalculator();
        assertEquals(6, calculator.value(3)); // 1 + 2 + 3 = 6
    }

    @Test
    void testAdd() {
        TriangleNumberCalculator calculator = new TriangleNumberCalculator();
        assertEquals(13, calculator.add(4, 2)); // 10 + 3 = 13
    }

    @Test
    void testSubtract() {
        TriangleNumberCalculator calculator = new TriangleNumberCalculator();
        assertEquals(7, calculator.subtract(4, 2)); // 10 - 3 = 7
    }
}
