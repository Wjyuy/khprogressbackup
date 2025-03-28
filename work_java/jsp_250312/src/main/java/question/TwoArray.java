package question;

public class TwoArray {
	private int num;
	public String process(int num) {
		String str="";
		for (int i = 0; i < num; i++) {
			str+="<br>";
			for (int j = 0; j < num; j++) {
				int x=(int)(10*Math.random()+1);
				str+=x+"&nbsp;&nbsp;&nbsp;";
			}
		}
		return str;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
}
