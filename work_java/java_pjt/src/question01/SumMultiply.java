package question01;

import java.util.Scanner;

public class SumMultiply {
	public static void main(String[] args) {
		System.out.print("2개의 정수 입력>>");
		Scanner scanner = new Scanner(System.in);
		int x=scanner.nextInt();
		int y=scanner.nextInt();
		System.out.println("두수의 합은"+(x+y));
		System.out.println("두수의 곱은"+(x*y));
		scanner.close();
	}
}
