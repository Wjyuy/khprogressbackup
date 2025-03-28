package question02;

import java.util.Scanner;

public class NestedIf {
	public static void main(String[] args) {
		System.out.print("점수를 입력하세요(0~100): ");
		Scanner scanner = new Scanner(System.in);
		int score=scanner.nextInt();
		System.out.print("학년을 입력하세요(1~4): ");
		int grade=scanner.nextInt();
//		if (grade==4) {
//			if (score>=70) {
//				System.out.println("합격!");
//			}
//			else {
//				System.out.println("불합격!");
//			}
//		}else if (score>=60) {
//			System.out.println("합격!");
//		}else {
//				System.out.println("불합격!");
//	}
		if(score>=60) {
			if(grade!=4) {
				System.out.println("합격!");
			}else if (score>=70) {
				System.out.println("합격!");
			}else {
				System.out.println("불합격!");
			}
		}else {
			System.out.println("불합격!");
		}
		
			scanner.close();
		
			
	}
}
