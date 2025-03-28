package question;

public class DivAndRemains {
	private int number;
	public boolean process() {
		if (number/10==number%10) {
			return true;
		}
		return false;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
}
