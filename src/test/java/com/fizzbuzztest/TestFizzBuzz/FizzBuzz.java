package com.fizzbuzztest.TestFizzBuzz;

public class FizzBuzz {
	
	public String play(int num) {
		/*return "";*/
		
		if (num % 3 == 0) {
			return "Fizz";
		}
		
		return String.valueOf(num);
	}

}
