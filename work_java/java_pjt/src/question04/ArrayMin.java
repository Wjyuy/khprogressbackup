package question04;

import java.util.Scanner;

public class ArrayMin {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("양수 7개를 입력하세요.");
		int[] intArray= new int[7];
//		int min=0;
		//2. 두번째 방법:
		int min=Integer.MAX_VALUE; //int 타입의 가장 큰 숫자!
		for (int i = 0; i < intArray.length; i++) {
			intArray[i]=scanner.nextInt();
//			1.첫번째 방법
//			if(i==0) {
//				min=intArray[0];
//			}
			if(min>intArray[i]) {
				min=intArray[i];
			}
		}
		System.out.println("가장 작은 수는 "+min+"입니다.");
		scanner.close();
	}
}
