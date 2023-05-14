package com.fizzbuzztest.TestFizzBuzz;

public class PopMatcher {
	
	public String play(int num) {
		
		/*Refactor for Pop*/
		if (num % 7 == 0) {
			return "Pop";
		}
		
		return String.valueOf(num);
	}

}
