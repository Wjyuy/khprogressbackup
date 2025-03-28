package question01;

import java.util.Scanner;

public class ExArea {
	public static void main(String[] args) {
		System.out.print("정수 를 입력하시오>>");
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		double area=0;
		
		if (c==0) {
			area=(double)(a*b)/2;
			System.out.println("삼각형의 넓이는"+area);
		}
		else {
			area=(double)(a+b)*c/2;
			System.out.println("사다리꼴의 넓이는"+area);
		}
		scanner.close();
	}
}
