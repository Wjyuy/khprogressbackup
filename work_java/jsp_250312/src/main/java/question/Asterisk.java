package question;

public class Asterisk {
	private int num;
	public String process(int num) {
		String result="";
		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num-i; j++) {
				result+="*";
			}
			result+="<br>";
		}
		return result;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	
}
