package question08;

import java.util.Scanner;

public class RandomArray {
	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		System.out.print("정수 몇개?");
		int num=scanner.nextInt();
		int[] numArray=new int[num];
		for (int i = 0; i < numArray.length; i++) {
			numArray[i]=(int)(Math.random()*100+1);
			System.out.print(numArray[i]+" ");
			if (i%10==0 && i!=0) {
				System.out.println();
			}
		}
		scanner.close();
	}
}
