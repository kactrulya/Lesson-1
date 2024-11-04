package org.example;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FactorialCalculatorTest {
    @Test
    public void testCalculateFactorial() {
        FactorialCalculator calculator = new FactorialCalculator();

        Assert.assertEquals(1, calculator.calculateFactorial(0));
        Assert.assertEquals(1, calculator.calculateFactorial(1));
        Assert.assertEquals(2, calculator.calculateFactorial(2));
        Assert.assertEquals(6, calculator.calculateFactorial(3));
        Assert.assertEquals(120, calculator.calculateFactorial(5));
    }
}
