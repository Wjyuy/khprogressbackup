package question02;

import java.util.Scanner;

public class ExGlobalStock {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("매수금액을 입력하세요: ");
		int buy=scanner.nextInt();
		System.out.print("매도금액을 입력하세요: ");
		int sell=scanner.nextInt();
		double yang=0;
		
		if (sell>buy) {
			yang=((sell-buy)*22/100);
		}else if (sell<=buy) {
			yang=0;
		}
		System.out.println("양도세 = "+yang);
		scanner.close();
	}
}
