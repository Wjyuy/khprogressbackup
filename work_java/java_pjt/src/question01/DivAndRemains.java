package question01;

import java.util.Scanner;

public class DivAndRemains {
	public static void main(String[] args) {
		System.out.print("2자리수 정수 입력(10~99)>>");
		Scanner scanner = new Scanner(System.in);
		int n=scanner.nextInt();
		int ten = n/10;
		int one = n%10;
		
		if(ten==one) {
			System.out.println("Yes!10의 자리와 1의 자리가 같습니다.");
		}
		else {
			System.out.println("NO! 10의 자리와 1의 자리가 다릅니다.");
		}
		scanner.close();
	}
}
