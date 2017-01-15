package pacroy.com;

import static org.junit.Assert.*;

import org.junit.Test;

public class FizzBuzz01Test {
/*** Avoid using setup() and teardown() prevents scrolling to read tests ***/
//	FizzBuzz01 fb;
//
//	@Before
//	public void setup() {
//		fb = new FizzBuzz01();
//	}

/*** Factory method with meaningful name helps making better readability ***/	
	public FizzBuzz01 createNewFizzBuzz01() {
		return new FizzBuzz01();
	}
	
/*** One method per one test scenario ***/
/*** Do not reuse constants from class-under-test to validate itself ***/
/*** Do not extract constants from expected results to keep good readability ***/
	@Test
	public void should_return_number_when_number() {
		FizzBuzz01 fb = createNewFizzBuzz01();
		assertEquals("1", fb.say(1));
		assertEquals("2", fb.say(2));		
	}

	@Test
	public void should_return_fizz_when_multiples_of_three() {
		FizzBuzz01 fb = createNewFizzBuzz01();
		assertEquals("Fizz", fb.say(3));
		assertEquals("Fizz", fb.say(6));
	}
	
	@Test
	public void should_return_buzz_when_multiples_of_five() {
		FizzBuzz01 fb = createNewFizzBuzz01();
		assertEquals("Buzz", fb.say(5));		
		assertEquals("Buzz", fb.say(10));
	}

	@Test
	public void should_return_fizzbuzz_when_multiples_of_three_and_five() {
		FizzBuzz01 fb = createNewFizzBuzz01();
		assertEquals("FizzBuzz", fb.say(15));		
		assertEquals("FizzBuzz", fb.say(30));
	}
}
