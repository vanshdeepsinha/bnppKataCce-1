package com.fizzbuzztest.TestFizzBuzz;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

public class AppFizzBuzzTest 
{
	private FizzBuzz fizzBuzz;
	
	private FizzBuzzMatcher fizzBuzzMatcher;
	@Before
	public void setup() {
		fizzBuzz = new FizzBuzz();
		fizzBuzzMatcher = new FizzBuzzMatcher();
	}
   
    @SuppressWarnings("deprecation")
	@Test
    public void testNumber()
    {
        /*Main Class of FizzBuzz Test*/
    	int num =1;
    	String retNumber = fizzBuzz.play(num);
    	
    	/*Checking if it is returning the right integer or not*/
    	Assert.assertEquals("1", retNumber);
    }
    
    @SuppressWarnings("deprecation")
	@Test
    public void testNumberDivisiblebyThree() {
    	int num = 123;
    	String retNumber = fizzBuzz.play(num);
    	/*Checking if it is returning Fizz or not*/
    	Assert.assertEquals("Fizz", retNumber);
    }
    
    @SuppressWarnings("deprecation")
    @Test
    public void testNumberDivisiblebyFive() {
    	int num = 200;
    	
    	String retNumber = fizzBuzz.play(num);
    	/*Checking if it is returning Fizz or not*/
    	Assert.assertEquals("Buzz", retNumber);
    }
    
    @SuppressWarnings("deprecation")
    @Test
    public void testNumberDivisiblebythreeAndFive() {
    	int num = 15;
    	String retNumber = fizzBuzzMatcher.play(num);
    	/*Checking if it is returning FizzBuzz or not*/
    	Assert.assertEquals("FizzBuzz", retNumber);
    }
}
