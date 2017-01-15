package pacroy.com;

public class TransferRule implements Rule {

	@Override
	public boolean isValid(int i) {
		return ((i % 3 == 0) && (i % 5 == 0));
	}

	@Override
	public String say(int i) {
		return "Transfer";
	}

}
