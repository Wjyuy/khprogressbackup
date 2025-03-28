package question06;

import java.util.Scanner;

public class MultipleOfThree {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numArray[]=new int[10];
		System.out.print("양의 정수 10개를 입력하시오>>");
		for (int i = 0; i < numArray.length; i++) {
			numArray[i]= scanner.nextInt();
		}
		System.out.print("3의 배수는 ");
		for (int i = 0; i < numArray.length; i++) {
			if(numArray[i]%3==0) {
				System.out.print(numArray[i]+" ");
			}
		}
		scanner.close();
	}
}
