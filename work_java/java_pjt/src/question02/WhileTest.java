package question02;

public class WhileTest {
	public static void main(String[] args) {
		int num=0;
		int sum=0;
		
		while (num<=99) {
			if(num%2==0) {
				sum+=num;
			}
			num++;
		}
		System.out.println(sum);
	}
}
