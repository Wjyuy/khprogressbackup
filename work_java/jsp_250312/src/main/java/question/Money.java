package question;

public class Money {
	private int won;
	public String process(int won) {
		String result="";
		if(won/50000>0) {
			result+="50000원 짜리 :"+won/50000+"개<br>";
			won=won%50000;
		}
		if(won/10000>0) {
			result+="10000원 짜리 :"+won/10000+"개<br>";
			won=won%10000;
		}
		if(won/1000>0) {
			result+="1000원 짜리 :"+won/1000+"개<br>";
			won=won%1000;
		}
		if(won/500>0) {
			result+="500원 짜리 :"+won/500+"개<br>";
			won=won%500;
		}
		if(won/100>0) {
			result+="100원 짜리 :"+won/100+"개<br>";
			won=won%100;
		}
		if(won/50>0) {
			result+="50원 짜리 :"+won/50+"개<br>";
			won=won%50;
		}
		if(won/10>0) {
			result+="10원 짜리 :"+won/10+"개<br>";
			won=won%10;
		}
		if(won/1>0) {
			result+="1원 짜리 :"+won+"개<br>";
		}
		return result;
	}
	public int getWon() {
		return won;
	}
	public void setWon(int won) {
		this.won = won;
	}
}
