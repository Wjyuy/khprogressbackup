package question02;

import java.util.Scanner;

public class ArithmeticExIf {
	public static void main(String[] args) {
		System.out.print("연산>>");
		Scanner scanner = new Scanner(System.in);
		int a=scanner.nextInt();
		char op=scanner.next().charAt(0);
//		String op= scanner.next();
		int b=scanner.nextInt();
		double result=0;
//		op.equals("+");
//		if (op.equals("+")) 를 조건으로 쓰면 된다 
		if (op=='+') {
			result=a+b;
		} else if (op=='-') {
			result=a-b;
		} else if (op=='*') {
			result=a*b;
		} else if (op=='/') {
			result=(double)a/b;
		} 
		System.out.println(""+a +op+ b+"의 계산 결과는 "+result);
		scanner.close();
	}
}
