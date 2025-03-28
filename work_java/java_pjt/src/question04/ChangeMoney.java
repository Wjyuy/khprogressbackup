package question04;

import java.util.Scanner;

public class ChangeMoney {
	public static void main(String[] args) {
		final int 오만원=50000;
		final int 만원=10000;
		final int 천원=1000;
		final int 백원=100;
		final int 오백원=500;
		final int 오십원=50;
		final int 십원=10;
		final int 일원=1;
		int res,money;
		Scanner scanner=new Scanner(System.in);
		System.out.println("금액을 입력하시오>>");
		money=scanner.nextInt();
		res=money/오만원;
		if (res>0) {
			System.out.println("오만원권 "+res+"매");
		}
		money=money%오만원;
		res=money/만원;
		if (res>0) {
			System.out.println("만원권 "+res+"매");
		}
		money=money%만원;
		res=money/천원;
		if (res>0) {
			System.out.println("천원권 "+res+"매");
		}
		money=money%천원;
		res=money/오백원;
		if (res>0) {
			System.out.println("오백원 "+res+"개");
		}
		money=money%오백원;
		res=money/백원;
		if (res>0) {
			System.out.println("백원 "+res+"개");
		}
		money=money%백원;
		res=money/오십원;
		if (res>0) {
			System.out.println("오십원 "+res+"개");
		}
		money=money%오십원;
		res=money/십원;
		if (res>0) {
			System.out.println("십원 "+res+"개");
		}
		money=money%십원;
		res=money/일원;
		if (res>0) {
			System.out.println("일원 "+res+"개");
		}
//		int num=scanner.nextInt();
//		if (num%50000>=1) {
//			System.out.println("오만원권 "+num/50000+"매");
//			num=num%50000;
//		}
//		if (num%10000>=1) {
//			System.out.println("만원권 "+num/10000+"매");
//			num=num%10000;
//		}
//		if (num%1000>=1) {
//			System.out.println("천원권 "+num/1000+"매");
//			num=num%1000;
//		}
//		if (num%100>=1) {
//			System.out.println("백원 "+num/100+"개");
//			num=num%100;
//		}
//		if (num%50>=1) {
//			System.out.println("오십원 "+num/50+"개");
//			num=num%50;
//		}
//		if (num%10>=1) {
//			System.out.println("십원 "+num/10+"개");
//			num=num%10;
//		}
//		System.out.println("일원 "+num+"개");
		scanner.close();
	}
}
