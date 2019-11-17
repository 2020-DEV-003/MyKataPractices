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
	public void shouldReturn1For1() {

		assertFinal(1,"1");
	}
	
	@Test
	public void shouldReturnFizzForMultiplesOf3() {

		assertFinal(3,"Fizz");
		assertFinal(6,"Fizz");
		assertFinal(9,"Fizz");
		assertFinal(12,"Fizz");
	}
	
	@Test
	public void shouldReturnBuzzForMultiplesOf5() {

		assertFinal(5,"Buzz");
		assertFinal(10,"Buzz");
		assertFinal(20,"Buzz");
	}
	@Test
	public void shouldReturnFizzBuzzForMultiplesOf3And5() {

		assertFinal(15,"FizzBuzz");
		assertFinal(30,"FizzBuzz");
		assertFinal(45,"FizzBuzz");
	}
	
	private void assertFinal(int number,String sExpectedResult)
	{
		String sResult=fizzBuzz.check(number);
		assertEquals(sExpectedResult, sResult);
		
	}
}
