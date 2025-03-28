package question07;

import java.util.Scanner;

public class ComputeInterest {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int principal=0;
		double rate=0;
		double balance=0;
		int years=0;
		System.out.print("원금을 입력하세요: ");
		principal=scan.nextInt();
		System.out.print("연이율을 입력하세요: ");
		rate=scan.nextDouble();
		balance=principal;
		System.out.println("\n연도수\t원리금");
		for (;;) {
			years=years+1;
			balance=balance*(1+rate/100);
			System.out.println(years+"\t"+balance);
			if(balance>=(principal*2)) {
				System.out.println("");
				break;
			}
		}
		System.out.println("필요한 연도수 = "+years);
	}
}
