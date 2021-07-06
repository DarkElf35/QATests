package com.company;

import com.company.QuadraticEquation;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.*;

public class QuadraticEquationTests {
    QuadraticEquation root = new QuadraticEquation();

    @Test
    void result() {
        String result;

        result = root.result(0,2,3);
        assertEquals("Не является квадратным уравнением", result);

        result = root.result(2,5,1);
        assertEquals("Нет  корней", result);

        result = root.result(2,5,2);
        assertEquals("-0.5, -2.0", result);

        result = root.result(1,2,1);
        assertEquals("-1.0", result);
    }
}
