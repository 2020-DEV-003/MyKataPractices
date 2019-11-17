package com.kata;

/**
 * 
 * Description : This class contain logic for make fizz and buzz and fizzbuzz
 *
 */
public class FizzBuzz {

	public String check(int number) {
		if (number > 0) {
			if (number % 3 == 0 && number % 5 == 0) {
				return "FizzBuzz";
			} else if (number % 3 == 0) {
				return "Fizz";
			} else if (number % 5 == 0) {
				return "Buzz";
			}
		}
		return String.valueOf(number);

	}

}
