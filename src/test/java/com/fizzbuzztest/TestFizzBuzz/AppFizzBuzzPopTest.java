package com.fizzbuzztest.TestFizzBuzz;

import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

public class AppFizzBuzzPopTest {
	
	private PopMatcher popMatcher;
	
	private FizzBuzzPopMatcher fizzBuzzPopMatcher;
	
	@Before
	public void setup () {
		
		popMatcher = new PopMatcher();
		fizzBuzzPopMatcher = new FizzBuzzPopMatcher();
	}
	
	@SuppressWarnings("deprecation")
	@Test
    public void testNumberDivisiblebySeven()
    {
        /*Main Class of FizzBuzz Test*/
    	int num =7;
    	String retNumber = popMatcher.play(num);    	
    	/*Checking if it is returning the right integer or not*/
    	Assert.assertEquals("Pop", retNumber);
    }
	
	@SuppressWarnings("deprecation")
	@Test
    public void testNumberDivisiblebyThreeAndSeven()
    {
        /*Main Class of FizzBuzz Test*/
    	int num =21;
    	String retNumber = fizzBuzzPopMatcher.play(num);    	
    	/*Checking if it is returning the right integer or not*/
    	Assert.assertEquals("FizzPop", retNumber);
    }
	
	@SuppressWarnings("deprecation")
	@Test
    public void testNumberDivisiblebyFiveAndSeven()
    {
        /*Main Class of FizzBuzz Test*/
    	int num =70;
    	String retNumber = fizzBuzzPopMatcher.play(num);    	
    	/*Checking if it is returning the right integer or not*/
    	Assert.assertEquals("BuzzPop", retNumber);
    }
	
	@SuppressWarnings("deprecation")
	@Test
    public void testNumberDivisiblebyThreeFiveSeven()
    {
        /*Main Class of FizzBuzz Test*/
    	int num =105;
    	String retNumber = fizzBuzzPopMatcher.play(num);    	
    	/*Checking if it is returning the right integer or not*/
    	Assert.assertEquals("FizzBuzzPop", retNumber);
    }

}
