package com.testtravis.testtravis;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorTest {
    @GetMapping("/")
    public long returnCalcul(){
        long num1=112341;
        long num2=218561;
        long sum=Calculator.sum(num1,num2);
        return sum;
    }
}
