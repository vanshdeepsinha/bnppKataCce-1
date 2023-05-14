package com.fizzbuzztest.TestFizzBuzz;

public class FizzBuzz {
	
	public String play(int num) {
		/*return "";*/
		
		/*Refactor for Fizz*/
		if (num % 3 == 0) {
			return "Fizz";
		}
		
		/*Refactor for Buzz*/
		if (num % 5 == 0) {
			 return "Buzz";
		  }
		
		return String.valueOf(num);
	}

}
