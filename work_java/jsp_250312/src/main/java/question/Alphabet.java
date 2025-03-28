package question;

public class Alphabet {
	private char alphabet;
	public String process(char alpha) {
		String result="";
		for (int i = 'a'; i < alphabet+1; i++) {
			result+=(char)i;
		}
		return result;
	}
	public char getAlphabet() {
		return alphabet;
	}
	public void setAlphabet(char alphabet) {
		this.alphabet = alphabet;
	}
}
