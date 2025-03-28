package question04;

import java.util.Scanner;

public class ArrayLength {
	public static void main(String[] args) {
		System.out.print("5개의 정수를 입력하세요>>");
		Scanner scanner = new Scanner(System.in);
		double sum=0;
		int numArray[]=new int[5];
		for (int i = 0; i < numArray.length; i++) {
			numArray[i]= scanner.nextInt();
			sum+=numArray[i];
		}
		System.out.println("평균은 "+sum/numArray.length);
		scanner.close();
	}
}
