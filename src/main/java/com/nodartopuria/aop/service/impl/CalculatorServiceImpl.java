package com.nodartopuria.aop.service.impl;

import com.nodartopuria.aop.Aspect.Println;
import com.nodartopuria.aop.service.CalculatorService;
import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {

    @Override
    public int multiplication(@Println int x,@Println int y) {
        return x*y;
    }
}
