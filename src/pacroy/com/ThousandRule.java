package pacroy.com;

public class ThousandRule implements Rule {

	@Override
	public boolean isValid(int i) {
		return ((i % 3 == 0) && (i % 7 == 0));
	}

	@Override
	public String say(int i) {
		return "Thousand";
	}

}
