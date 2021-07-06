package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTestMinus {

    @Test
    void plus() {
        Calculator calc = new Calculator(5,-2);


        int value = calc.minus(-5,-2);


        assertEquals(3,value);

    }
}