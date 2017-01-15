package pacroy.com;

import static org.junit.Assert.*;

import org.junit.Test;

public class FizzBuzz02Test {
	
	public FizzBuzz02 createNewFizzBuzz02() {
		return new FizzBuzz02();
	}
	
	@Test
	public void should_return_number_when_number() {
		FizzBuzz02 fb = createNewFizzBuzz02();
		assertEquals("1", fb.say(1));
		assertEquals("2", fb.say(2));		
	}

	@Test
	public void should_return_fizz_when_multiples_of_three() {
		FizzBuzz02 fb = createNewFizzBuzz02();
		assertEquals("Fizz", fb.say(3));
		assertEquals("Fizz", fb.say(6));
	}
	
	@Test
	public void should_return_buzz_when_multiples_of_five() {
		FizzBuzz02 fb = createNewFizzBuzz02();
		assertEquals("Buzz", fb.say(5));		
		assertEquals("Buzz", fb.say(10));
	}

	@Test
	public void should_return_fizzbuzz_when_multiples_of_three_and_five() {
		FizzBuzz02 fb = createNewFizzBuzz02();
		assertEquals("FizzBuzz", fb.say(15));		
		assertEquals("FizzBuzz", fb.say(30));
	}
	
	@Test
	public void should_return_wow_when_multiples_of_seven() {
		FizzBuzz02 fb = createNewFizzBuzz02();
		assertEquals("Wow", fb.say(7));		
		assertEquals("Wow", fb.say(14));
	}
	
	@Test
	public void shold_return_fizzwow_when_multiples_of_three_and_seven() {
		FizzBuzz02 fb = createNewFizzBuzz02();
		assertEquals("FizzWow", fb.say(21));
		assertEquals("FizzWow", fb.say(42));
	}
	
	@Test
	public void shold_return_buzzwow_when_multiples_of_five_and_seven() {
		FizzBuzz02 fb = createNewFizzBuzz02();
		assertEquals("BuzzWow", fb.say(35));
		assertEquals("BuzzWow", fb.say(70));
	}
	
	@Test
	public void shold_return_fizzbuzzwow_when_multiples_of_three_five_and_seven() {
		FizzBuzz02 fb = createNewFizzBuzz02();
		assertEquals("FizzBuzzWow", fb.say(105));
		assertEquals("FizzBuzzWow", fb.say(210));
	}
}
