package pacroy.com;

public class FizzBuzz02 {

//	private static final String BUZZ = "Buzz";
//	private static final String FIZZ = "Fizz";

	private Rule[] rules = { new FizzRule(),
			 				 new BuzzRule(),
			 				 new WowRule() };
	
	public String say(int i) {
		String s = "";
		for (Rule r : rules) {
			if (r.isValid(i)) {
				s += r.say(i);
			}
		}
		
/*** These methods have the same pattern, replace them with interface method ***/
//		if (isValidFizz(i)) {
//			s += FIZZ;
//		}
//		if (isValidBuzz(i)) {
//			s += BUZZ;
//		}
/*** Making change to the existing code indicates bad design ***/
//		if (i % 7 == 0) {
//			s += "Wow";
//		}
/*** Replace with DefaultRule ***/
		if (s == "") {
//			s = String.valueOf(i);
			s = new DefaultRule().say(i);
		}
		return s;
	}

//	private boolean isValidBuzz(int i) {
//		return i % 5 == 0;
//	}
//
//	private boolean isValidFizz(int i) {
//		return i % 3 == 0;
//	}
	
}
