package pacroy.com;

public class ForeseeRule implements Rule {

	@Override
	public boolean isValid(int i) {
		return ((i % 5 == 0) && (i % 7 == 0));
	}

	@Override
	public String say(int i) {
		return "Foresee";
	}

}
