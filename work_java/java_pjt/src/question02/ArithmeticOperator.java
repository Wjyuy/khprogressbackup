package question02;

import java.util.Scanner;

public class ArithmeticOperator {
	public static void main(String[] args) {
		System.out.print("정수를 입력하세요: ");
		Scanner scanner=new Scanner(System.in);
		int time=scanner.nextInt();
		int hour=time/3600;
		int min=(time/60)%60;
		int sec=time%60;
		System.out.println(time+"초는"+hour+"시간,"+min+"분,"+sec+"초 입니다.");
		scanner.close();
	}
}
