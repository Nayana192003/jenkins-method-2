package com.example;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorTest {
    @Test
    public void testAddition() {
        Calculator calculator = new Calculator();
        int result = calculator.add(3, 5);
        Assert.assertEquals(result, 8, "Addition result is incorrect");
    }
}
 
