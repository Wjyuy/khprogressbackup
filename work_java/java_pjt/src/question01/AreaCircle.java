package question01;

import java.util.Scanner;

public class AreaCircle {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("반지름을 입력하세요>>");
		int r= scanner.nextInt();
		double result=3.14*r*r;
		System.out.println("원의 면적은"+result+"입니다.");
		scanner.close();
	}
}
