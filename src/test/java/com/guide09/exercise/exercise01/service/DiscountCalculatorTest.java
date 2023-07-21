package com.guide09.exercise.exercise01.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DiscountCalculatorTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void discount() {
        double result;

        result = new DiscountCalculator().discount(100, 10);
        assertEquals(900, result);

        result = new DiscountCalculator().discount(100, 9, 0.1);
        assertEquals(900, result);

        result = new DiscountCalculator().discount(100, 11, 0.1, true);
        assertEquals(990, result);

        result = new DiscountCalculator().discount(100, 0, 0.1, false);
        assertEquals(0, result);
    }
}