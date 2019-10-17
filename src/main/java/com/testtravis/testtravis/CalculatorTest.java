package com.testtravis.testtravis;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorTest {
    @GetMapping("/")
    public long returnCalcul(){
        long num1=1;
        long num2=2;
        long sum=Calculator.sum(num1,num2);
        if (sum!=3) throw new AssertionError();
        return sum;
    }
}
