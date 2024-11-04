package org.example;

import org.junit.jupiter.api.*;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class FactorialCalculatorTest {


    @BeforeAll
    public static void someInfo(){
        System.out.println("этот метод выполнился до факториала");
    }

    @RepeatedTest(3)
    @DisplayName("факториал")
    public void testCalculateFactorial() {
        FactorialCalculator calculator = new FactorialCalculator();

        Assertions.assertEquals(1, calculator.calculateFactorial(0));
        Assertions.assertEquals(1, calculator.calculateFactorial(1));
        Assertions.assertEquals(2, calculator.calculateFactorial(2));
        Assertions.assertEquals(6, calculator.calculateFactorial(3));
        Assertions.assertEquals(120, calculator.calculateFactorial(5));
    }
    @AfterMethod
    public void after() {
        System.out.println("Этот метод выполнился после факториала");
    }

}
