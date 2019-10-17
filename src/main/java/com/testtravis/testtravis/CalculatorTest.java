package com.testtravis.testtravis;


import org.junit.Test;

public class CalculatorTest {
    @Test
    public void returnCalcul(){
        long num1=1;
        long num2=2;
        long sum=Calculator.sum(num1,num2);
        if (sum!=3) throw new AssertionError();
    }
}
