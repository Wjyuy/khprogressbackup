package question03;

public class DoWhileTest {
	public static void main(String[] args) {
		int num=0;
		int sum=0;
		do {
			if(num%2==0) {
				sum+=num;
			}
			num++;
		} while (num<=99);
		System.out.println(sum);
	}
}
