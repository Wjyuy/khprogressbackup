package question03;

import java.util.Scanner;

public class Tesla {
	public static void main(String[] args) {
		System.out.print("매수 수량을 입력하시오>>");
		Scanner scanner=new Scanner(System.in);
		int hunddol=0;
		int tendol=0;
		int tesla=520*(scanner.nextInt());
		hunddol=tesla/100;
		tendol=(tesla/10)%10;
		System.out.println("100달러짜리 "+hunddol+"매");
		if (tendol!=0) {
			System.out.println("10달러짜리 "+tendol+"매");
		}
		scanner.close();
	}
}
