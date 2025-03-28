package question03;

import java.util.Scanner;

public class ThreeSixNine {
	public static void main(String[] args) {
		System.out.print("10~99사이의 정수를 입력하시오 >>");
		Scanner scanner=new Scanner(System.in);
		int clap=0;
		String num = scanner.next();
		if(num.charAt(0)=='3' ||num.charAt(0)=='6' ||num.charAt(0)=='9') {
			clap++;
		}
		if(num.charAt(1)=='3' ||num.charAt(1)=='6' ||num.charAt(1)=='9') {
			clap++;
		}
		if(clap==0)
			System.out.println("박수");
		if(clap==1)
			System.out.println("박수짝");
		if(clap==2)
			System.out.println("박수짝짝");
		
		scanner.close();
	}
}
