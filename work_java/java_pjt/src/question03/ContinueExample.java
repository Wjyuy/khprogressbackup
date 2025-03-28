package question03;

import java.util.Scanner;

public class ContinueExample {
	public static void main(String[] args) {
		System.out.println("정수를 5개 입력하세요.");
		Scanner scanner=new Scanner(System.in);
		int n1=0; 
		int sum=0;
		for (int i = 0; i < 5; i++) {
			n1=scanner.nextInt(); 
			if(n1>0) {
				sum+=n1;
			}
		}
		System.out.println("양수의 합은"+sum);
		scanner.close();
	}
}
