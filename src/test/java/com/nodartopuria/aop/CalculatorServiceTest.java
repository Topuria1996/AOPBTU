package com.nodartopuria.aop;

import com.nodartopuria.aop.service.CalculatorService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CalculatorServiceTest {
    @Autowired
    CalculatorService calculatorService;

    @Test
    void multiplication() {
        int expected = 20;
        int actual = calculatorService.multiplication(10,2);
        System.out.println(assertEqual(expected,actual));
    }

    boolean assertEqual(int x,int y){
        return x == y;
    }
}
