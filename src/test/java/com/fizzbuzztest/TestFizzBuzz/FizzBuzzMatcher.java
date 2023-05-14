package com.fizzbuzztest.TestFizzBuzz;

public class FizzBuzzMatcher {
	
	public String play(int num) {
		/*Refactor for FizzBuzz*/
		if (num % 3 == 0 && num % 5 == 0) {
			 return "FizzBuzz";
		  }
		
		return String.valueOf(num);
	}

}
