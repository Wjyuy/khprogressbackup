package question03;

public class ForSample {
	public static void main(String[] args) {
		int sum=0;
		for (int i = 1; i <10; i++) {
			sum+=i;
			System.out.print(i+"+");
			
		}
		sum+=10;
		System.out.print(10+"="+sum);
	}
}
