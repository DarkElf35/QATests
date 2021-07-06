package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTestSum {

    @Test
    void plus() {
        Calculator calc = new Calculator();


        int value = calc.plus(3,5);


        assertEquals(8,value);

    }
}