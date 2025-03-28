package question01;

import java.util.Scanner;

public class ExExchange {
	public static void main(String[] args) {
		System.out.print("원화를 입력하세요(단위 원)>>");
		final int RATEDOL=1200;
//		환율 고정할때 상수 사용(관습적으로 대문자)
		final int RATEEUR=1500;
		
		Scanner scanner = new Scanner(System.in);
		int won = scanner.nextInt();
		double dollor=(double)won/RATEDOL;
		double eur=(double)won/RATEEUR;
		
		System.out.println(won+"원은 $"+dollor+"입니다.");
		System.out.println(won+"원은 E"+eur+"입니다.");
		
		scanner.close();
		
	}
}
