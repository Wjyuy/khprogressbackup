package question04;

import java.util.Scanner;

public class printAsterisk {
	public static void main(String[] args) {
		System.out.print("정수를 입력하시오>>");
		Scanner scanner=new Scanner(System.in);
		int num=scanner.nextInt();
		for (int i = 0; i !=num; i++) {
			for (int j = (num-i); j !=0; j--) {
				System.out.print("*");
			}
			System.out.println("");
		}
		scanner.close();
	}
}
