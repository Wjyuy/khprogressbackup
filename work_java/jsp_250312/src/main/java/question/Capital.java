package question;

public class Capital {
	private String alphabet;
	public String process() {
		StringBuffer stringBuffer = new StringBuffer();
		
		char c='A';
		char c2= alphabet.charAt(0);
		
		for (char i = c2; i >= c; i--) {
			for (char j = c; j < i; j++) {
				stringBuffer.append(j);
			}
			stringBuffer.append("<br>");
		}
		
		return stringBuffer.toString();
	}
	public String getAlphabet() {
		return alphabet;
	}
	public void setAlphabet(String alphabet) {
		this.alphabet = alphabet;
	} 
}
