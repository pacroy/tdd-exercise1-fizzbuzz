package pacroy.com;

import static org.junit.Assert.*;

import org.junit.Test;

public class FizzBuzz03Test {

	public FizzBuzz03 createNewFizzBuzz03() {
		return new FizzBuzz03();
	}
	
	@Test
	public void should_return_number_when_number() {
		FizzBuzz03 fb = createNewFizzBuzz03();
		assertEquals("1", fb.say(1));
		assertEquals("2", fb.say(2));		
	}

	@Test
	public void should_return_fizz_when_multiples_of_three() {
		FizzBuzz03 fb = createNewFizzBuzz03();
		assertEquals("Fizz", fb.say(3));
		assertEquals("Fizz", fb.say(6));
	}
	
	@Test
	public void should_return_buzz_when_multiples_of_five() {
		FizzBuzz03 fb = createNewFizzBuzz03();
		assertEquals("Buzz", fb.say(5));		
		assertEquals("Buzz", fb.say(10));
	}

/*** This test scenario is no longer valid ***/
//	@Test
//	public void should_return_fizzbuzz_when_multiples_of_three_and_five() {
//		FizzBuzz03 fb = createNewFizzBuzz03();
//		assertEquals("FizzBuzz", fb.say(15));		
//		assertEquals("FizzBuzz", fb.say(30));
//	}
	
	@Test
	public void should_return_wow_when_multiples_of_seven() {
		FizzBuzz03 fb = createNewFizzBuzz03();
		assertEquals("Wow", fb.say(7));		
		assertEquals("Wow", fb.say(14));
	}

/*** These test scenarios are no longer valid ***/
//	@Test
//	public void shold_return_fizzwow_when_multiples_of_three_and_seven() {
//		FizzBuzz03 fb = createNewFizzBuzz03();
//		assertEquals("FizzWow", fb.say(21));
//		assertEquals("FizzWow", fb.say(42));
//	}
//	@Test
//	public void shold_return_buzzwow_when_multiples_of_five_and_seven() {
//		FizzBuzz03 fb = createNewFizzBuzz03();
//		assertEquals("BuzzWow", fb.say(35));
//		assertEquals("BuzzWow", fb.say(70));
//	}
//	
//	@Test
//	public void shold_return_fizzbuzzwow_when_multiples_of_three_five_and_seven() {
//		FizzBuzz03 fb = createNewFizzBuzz03();
//		assertEquals("FizzBuzzWow", fb.say(105));
//		assertEquals("FizzBuzzWow", fb.say(210));
//	}

/*** Repeat TDD to add new test scenarios one-by-one ***/
	@Test
	public void should_return_transfer_when_multiples_of_three_and_five() {
		FizzBuzz03 fb = createNewFizzBuzz03();
		assertEquals("Transfer", fb.say(15));		
		assertEquals("Transfer", fb.say(30));
	}
	
	@Test
	public void shold_return_thousand_when_multiples_of_three_and_seven() {
		FizzBuzz03 fb = createNewFizzBuzz03();
		assertEquals("Thousand", fb.say(21));
		assertEquals("Thousand", fb.say(42));
	}
	
	@Test
	public void shold_return_foresee_when_multiples_of_five_and_seven() {
		FizzBuzz03 fb = createNewFizzBuzz03();
		assertEquals("Foresee", fb.say(35));
		assertEquals("Foresee", fb.say(70));
	}
	
	@Test
	public void shold_return_tfs_when_multiples_of_three_five_and_seven() {
		FizzBuzz03 fb = createNewFizzBuzz03();
		assertEquals("TFS", fb.say(105));
		assertEquals("TFS", fb.say(210));
	}
}
