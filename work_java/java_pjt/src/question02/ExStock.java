package question02;

import java.util.Scanner;

public class ExStock {
	public static void main(String[] args) {
		System.out.print("코스피 지수를 입력하세요(1800~2500):");
		Scanner scanner =new Scanner(System.in);
		int kospy=scanner.nextInt();
		System.out.print("환율을 입력하세요(1100~1200):");
		int charge=scanner.nextInt();
		if (charge>=1150) {
			if (kospy>=2200) {
				System.out.println("상승장");
			} else if(kospy>=2000) {
				System.out.println("횡보장");
			}else
				System.out.println("하락장");
		} else {
			if (kospy>=2300) {
				System.out.println("상승장");
			} else if(kospy>=2000) {
				System.out.println("횡보장");
			}else
				System.out.println("하락장");
		}
		scanner.close();
	}
}
