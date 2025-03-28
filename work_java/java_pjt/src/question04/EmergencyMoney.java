package question04;

import java.util.Scanner;

public class EmergencyMoney {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("가구수를 입력하시오>>");
		int family=scanner.nextInt();
		int dollormoney=0;
		int dollor=1200;
		int money=0;
		if (family==1) {
			money=400000;			
		}else if (family==2) {
			money=600000;			
		}else if (family==3) {
			money=800000;			
		}else {
			money=1000000;
		}
		dollormoney=money/dollor;
		System.out.println("100달러짜리 "+dollormoney/100+"매");
		if (dollormoney%10!=0) {
			System.out.println("10달러짜리 "+dollormoney%10+"매");
		}
		scanner.close();
	}
}
