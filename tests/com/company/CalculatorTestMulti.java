package com.company;

import com.company.Calculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTestMulti {

    @Test
    void plus() {
        Calculator calc = new Calculator();


        int value = calc.multiply(-5,8);


        assertEquals(-40,value);

    }
}