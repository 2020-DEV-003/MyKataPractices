package com.kata.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.kata.FizzBuzz;

public class FizzBuzzTest {
	FizzBuzz fizzBuzz;

	@Before
	public void setUP() {
		fizzBuzz = new FizzBuzz();
	}

	@Test
	public void testGivenNumberIsValidOrNot() {
		assertFinal(0, "0");
	}

	/**
	 * This method should test whether given number is returned if it is not
	 * multiples of 3 and 5 or not
	 */
	@Test
	public void shouldReturnSameNumberForNonMultiplesOf3And5() {
		assertFinal(1, "1");
		assertFinal(2, "2");
		assertFinal(4, "4");
	}

	@Test
	public void shouldReturnFizzForMultiplesOf3() {

		assertFinal(3, "Fizz");
		assertFinal(6, "Fizz");
		assertFinal(9, "Fizz");
		assertFinal(12, "Fizz");
	}

	@Test
	public void shouldReturnBuzzForMultiplesOf5() {

		assertFinal(5, "Buzz");
		assertFinal(10, "Buzz");
		assertFinal(20, "Buzz");
	}

	@Test
	public void shouldReturnFizzBuzzForMultiplesOf3And5() {

		assertFinal(15, "FizzBuzz");
		assertFinal(30, "FizzBuzz");
		assertFinal(45, "FizzBuzz");
	}

	private void assertFinal(int number, String sExpectedResult) {
		String sResult = fizzBuzz.check(number);
		assertEquals(sExpectedResult, sResult);

	}
}
