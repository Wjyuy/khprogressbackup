package chapter03;

import java.util.Scanner;

/*
 * 정수3개를 입력받음
 * 정수가 아닌 경우 패스
 * 3개의 합 출력
 * 예외처리 이용
 * */
public class InputException {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int sum=0,n=0;
		
		System.out.print("정수 3개를 입력하시오 ");
		for (int i = 0; i < 3; i++) {
			System.out.print(">>");
			try {
				n= scanner.nextInt();
			} catch (Exception e) {
				System.out.println("정수가 아닙니다. 다시 입력하세요!");
				n= 0;
				scanner.next(); //정수가 아닌 것 패스
				//(문자열 입력 받은게 계속 남아있어서 catch가 무한반복 되는것 방지)
				i--; //다시 입력받기 위해 카운트 감소
//				continue; //합계 누적 방지
//				break;
			}
			sum+=n;
		}
		System.out.println("합계: "+sum);
		scanner.close();
	}
}
