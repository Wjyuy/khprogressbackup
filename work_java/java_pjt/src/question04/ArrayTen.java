package question04;

import java.util.Scanner;

public class ArrayTen {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("10개의 정수를 입력하세요>>");
		int[] intArray=new int[10];
		int sum=0;
		for (int i = 0; i < intArray.length; i++) {
			intArray[i]=scanner.nextInt();
			sum+=intArray[i];
			
		}
		System.out.println("합계는 "+sum);
		scanner.close();
	}
}
