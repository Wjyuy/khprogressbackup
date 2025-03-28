package question04;

import java.util.Scanner;

public class ArrayAccess {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("양수 5개를 입력하세요.");
		int numArray[]=new int[5];
		int max=0;
		for (int i = 0; i < numArray.length; i++) {
			numArray[i]=scanner.nextInt();
			if(max<numArray[i]) {
				max=numArray[i];
			}
		}
		System.out.println("가장 큰 수는"+max+"입니다.");
		scanner.close();
	}
}
