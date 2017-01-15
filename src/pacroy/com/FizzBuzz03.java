package pacroy.com;

public class FizzBuzz03 {
/*** May apply Inversion of Control (IoC) to this array***/
	private Rule[] rules = { 
			new TFSRule(),
			new ForeseeRule(),
		    new ThousandRule(),
			new TransferRule(),
			new WowRule(),
			new BuzzRule(),
			new FizzRule(),
			};

/*** Implement new logic with better maintainability ***/
	public String say(int i) {
		for (Rule r : rules) {
			if (r.isValid(i)) {
				return r.say(i);
			}
		}
		return new DefaultRule().say(i);
	}
	
/*** Existing logic does not work anymore ***/	
//	public String say(int i) {
//		String s = "";
//		for (Rule r : rules) {
//			if (r.isValid(i)) {
//				s += r.say(i);
//			}
//		}
//		if (s == "") {
//			s = new DefaultRule().say(i);
//		}
//		return s;
//		}
//	}

}