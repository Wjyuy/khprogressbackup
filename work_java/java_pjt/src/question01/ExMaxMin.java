package question01;

import java.util.Scanner;

public class ExMaxMin {
	public static void main(String[] args) {
		System.out.println("정수 3개 입력 >>");
		Scanner scanner = new Scanner(System.in);
		int a=scanner.nextInt();
		int b=scanner.nextInt();
		int c=scanner.nextInt();
		int max=a;
		int min=a;
		
		if (a>b && a>c) {
			max=a;
		}else if (b>a && b>c) {
			max=b;
		}else
			max=c;
		
		if (a<b && a<c) {
			min=a;
		}else if (b<a && b<c) {
			min=b;
		}else
			min=c;
		
//		if (max<b){
//			max=b;
//		}
//		if (max<c) {
//			max=c;
//		}
//		if (min>b) {
//			min=b;
//		}
//		if (min>c) {
//			min=c;
//		}
		System.out.println("최대값은"+max);
		System.out.println("최소값은"+min);
		scanner.close();
	}
}
