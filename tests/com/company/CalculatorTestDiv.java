package com.company;

import com.company.Calculator;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTestDiv {

    @Test
    void plus() {
        Calculator calc = new Calculator();

        assertEquals(2, calc.division(20,10));



    }
    @Test
    public void operations() throws Exception {

        Calculator valid = new Calculator();
        assertEquals(0, valid.division(5,0));         //поймали ошибку но перевернутую так как в ветвлении задали 0 если деление на ноль
}}