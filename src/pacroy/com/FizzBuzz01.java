package pacroy.com;

public class FizzBuzz01 {

	private static final String BUZZ = "Buzz";
	private static final String FIZZ = "Fizz";

	public String say(int i) {
		String s = "";
		if (i % 3 == 0) {
			s += FIZZ;
		}
		if (i % 5 == 0) {
			s += BUZZ;
		}
		if (s == "") {
			s = String.valueOf(i);
		}
		return s;
	}

}
