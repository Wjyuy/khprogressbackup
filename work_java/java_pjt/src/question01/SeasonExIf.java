package question01;

import java.util.Scanner;

public class SeasonExIf {
	public static void main(String[] args) {
		System.out.print("달을 입력하세요(1~12)>>");
		Scanner scanner = new Scanner(System.in);
		
		int num=scanner.nextInt();
		if (num>=3 && num<=5) {
			System.out.println("봄");
		}else if(num>=6 && num<=8) {
			System.out.println("여름");
		}else if(num>=9 && num<=11) {
			System.out.println("가을");
		}else if(num==12 || num==1 || num==2)
			System.out.println("겨울");
		else 
			System.out.println("잘못입력");
		scanner.close();
	}
}
