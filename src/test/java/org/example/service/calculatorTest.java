package org.example.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class calculatorTest {
    Calculator calculator=new Calculator();

    @Test
    public void add(){
        int actual=calculator.addition(10,10);

        Assertions.assertEquals(20,actual);
    }
    @Test
    @Disabled
    public void sub(){
        int actual=calculator.subtraction(10,10);

        Assertions.assertEquals(0,actual);
    }
    @Test
    public void mul(){
        int actual=calculator.multiplication(10,10);

        Assertions.assertEquals(100,actual);
    }
    @Test
    public void div(){
        int actual=calculator.division(20,5);

        Assertions.assertEquals(4,actual);
    }


}
