package org.example;

import org.example.service.Calculator;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Calculator calculator=new Calculator();
        int val= calculator.addition(10,10);
        System.out.println("Addition of 2 no is:"+val);
    }
}
