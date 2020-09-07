package com.sapient.ui;

import com.sapient.service.Calculator;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Calculator mycal=new Calculator();
        System.out.println(mycal.addition(2.0, 3.0) );
        System.out.println(mycal.substraction(2,3));
    }
}
