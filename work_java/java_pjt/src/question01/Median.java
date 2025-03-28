package question01;

import java.util.Scanner;

public class Median {
	public static void main(String[] args) {
		System.out.print("정수 3개 입력>>");
		Scanner scanner = new Scanner(System.in);
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		int num3 = scanner.nextInt();
		
		int mid=0;
		if ((num1>num2 && num1<num3) || (num1>num3 && num1<num2)) {
			mid=num1;
		}else if ((num2>num1 && num2<num3) || (num2>num3 && num2<num1)) {
			mid=num2;
		}else {
			mid=num3;
		}
		 
//		
//		if((num1>num2) && (num1>num3)) {
//			if(num3>num2) {
//				mid=num3;
//			}
//			else {
//				mid=num2;
//			}
//		}
//		else if((num2>num3) && (num2>num1)) {
//			if(num3>num1) {
//				mid=num3;
//			}
//			else mid=num1;
//		}
//		else
//			if(num1>num2) {
//				mid=num1;
//			}
//			else mid=num2;
		System.out.println("중간값은"+mid);
		scanner.close();
	}
}
