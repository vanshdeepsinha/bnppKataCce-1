package com.fizzbuzztest.TestFizzBuzz;

public class FizzBuzzPopMatcher {
	
	public String play(int num) {
		
		if (num % 3 == 0 && num % 7 == 0) {
			 return "FizzPop";
		  }
		
		if (num % 5 == 0 && num % 7 == 0) {
			 return "BuzzPop";
		  }
		
		return String.valueOf(num);
	}

}
