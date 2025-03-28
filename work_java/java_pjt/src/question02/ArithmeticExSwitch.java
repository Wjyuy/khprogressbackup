package question02;

import java.util.Scanner;

public class ArithmeticExSwitch {
	public static void main(String[] args) {
		System.out.print("연산>>");
		Scanner scanner = new Scanner(System.in);
		int a=scanner.nextInt();
		String op= scanner.next();
		int b=scanner.nextInt();
		scanner.close();
		double result=0;
		switch (op) {
		case "+":
			result=a+b;
			break;
		case "-":
			result=a-b;
			break;
		case "*":
			result=a*b;
			break;
		case "/":
			if(b==0) {
				System.out.println("0으로 나눌 수 없습니다.");
				return;
			}
			result=a/b;
			break;
		default:
			System.out.println("잘못된 입력입니다!");
			return;
		}
		System.out.println(""+a+op+b+"의 계산 결과는 "+result);
//		if (op.equals("+")) {
//			
//		}
//		if (op=='+') {
//		} else if (op=='-') {
//			result=a-b;
//		} else if (op=='*') {
//			result=a*b;
//		} else if (op=='/') {
//			result=(double)a/b;
//		} 
	}
}
