package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTestGet {

    @Test
    void plus() {
        Calculator calc = new Calculator();

        calc.setA(2147483647);
        int value = calc.getA();


        assertEquals(5555555,value);

    }
}