package question;

public class Array3 {
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	private int num;
	public String process(int num) {
		String result="";
		for (int i = 0; i < num; i++) {
			if(i%10==0 && i!=0) {
				result+="<br>";
			}
			int x=(int)(100 * Math.random());
			result+=x+" ";
		}
		return result;
	}
}
