package question;

public class ThreeSixNine {
	private int num;
	public String process(int num) {
		String result="박수";
		int ten= num/10;
		int one= num%10;
			if(ten==3 || ten==6 || ten==9) {
				result+="짝";
			}
			if(one==3 || one==6 || one==9) {
				result+="짝";
			}
			if(result.equals("박수")) {
				result+=" 없음";
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
