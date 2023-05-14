package com.fizzbuzztest.TestFizzBuzz;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import junit.framework.Assert;

public class AppFizzBuzzTest 
{
   
    @SuppressWarnings("deprecation")
	@Test
    public void testNumber()
    {
        /*Main Class of FizzBuzz Test*/
    	
    	FizzBuzz fizzBuzz = new FizzBuzz();
    	
    	int num =1;
    	
    	String retNumber = fizzBuzz.play(num);
    	
    	/*Checking if it is returning the right integer or not*/
    	
    	Assert.assertEquals("1", retNumber);
    }
}
