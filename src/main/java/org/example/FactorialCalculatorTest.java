package org.example;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;

public class FactorialCalculatorTest {


    @BeforeMethod
    public void before(){
        System.out.println("этот метод выполнился до факториала");
    }

    @Test
    public void testCalculateFactorial() {
        FactorialCalculator calculator = new FactorialCalculator();

        Assert.assertEquals(1, calculator.calculateFactorial(0));
        Assert.assertEquals(1, calculator.calculateFactorial(1));
        Assert.assertEquals(2, calculator.calculateFactorial(2));
        Assert.assertEquals(6, calculator.calculateFactorial(3));
        Assert.assertEquals(120, calculator.calculateFactorial(5));
    }
    @AfterMethod
    public void after() {
        System.out.println("Этот метод выполнился после факториала");
    }

}
