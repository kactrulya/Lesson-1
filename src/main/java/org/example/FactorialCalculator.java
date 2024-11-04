package org.example;

import org.testng.Assert;
import org.testng.annotations.Test;


public class FactorialCalculator {


    public int calculateFactorial(int number) {
        int factorial = 1;

        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }

        return factorial;
    }


}
