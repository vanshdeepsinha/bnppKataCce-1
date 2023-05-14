package com.fizzbuzztest.TestFizzBuzz;

import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

public class AppFizzBuzzPopTest {
	
	private PopMatcher popMatcher;
	
	@Before
	public void setup () {
		popMatcher = new PopMatcher();
	}
	
	@SuppressWarnings("deprecation")
	@Test
    public void testNumber()
    {
        /*Main Class of FizzBuzz Test*/
    	int num =7;
    	String retNumber = popMatcher.play(num);    	
    	/*Checking if it is returning the right integer or not*/
    	Assert.assertEquals("Pop", retNumber);
    }

}
