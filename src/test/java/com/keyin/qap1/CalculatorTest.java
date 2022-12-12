package com.keyin.qap1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    Calculator Calc = new Calculator();

    @Test
    public void testAdd() {
        int expectedResult = 69;
        long result = Calc.add(30, 39);
        System.out.println(result);
        Assertions.assertEquals(expectedResult, result);
    }

    @Test
    public void testSubtract() {
        int expectedResult = 5;
        int result = Calc.subtract(75, 70);
        System.out.println(result);
        Assertions.assertEquals(expectedResult, result);
    }

    @Test
    public void testMultiply() {
        int expectedResult = 16;
        long result = Calc.multiply(4, 4);
        System.out.println(result);
        Assertions.assertEquals(expectedResult, result);
    }

    @Test
    public void testDivide() {
        int expectedResult = 10;
        long result = Calc.divide(50, 5);
        System.out.println(result);
        Assertions.assertEquals(expectedResult, result);
    }

}