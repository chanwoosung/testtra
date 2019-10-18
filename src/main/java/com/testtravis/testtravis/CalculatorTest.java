package com.testtravis.testtravis;


import lombok.AllArgsConstructor;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

@RestController
@AllArgsConstructor
public class CalculatorTest {
    private Environment env;

    @GetMapping("/")
    public long returnCalcul(){
        long num1=112341;
        long num2=218561;
        long sum=Calculator.sum(num1,num2);
        return sum;
    }
    @GetMapping("/profile")
    public String getProfile () {
        return Arrays.stream(env.getActiveProfiles())
                .findFirst()
                .orElse("");
    }
}
