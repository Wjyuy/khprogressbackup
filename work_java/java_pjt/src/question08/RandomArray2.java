package question08;

import java.util.Scanner;

public class RandomArray2 {
//	난수의 중복체크하는 메소드 
	public static boolean exists(int a[],int to, int r) {
		for (int i = 0; i < to; i++) {
			if (a[i]==r) {
				return true;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		System.out.print("정수 몇개?");
		int num=scanner.nextInt();
		int[] numArray=new int[num];
		for (int i = 0; i < numArray.length; i++) {
			int r =(int)(Math.random()*100+1);
			if(exists(numArray, i, r)) {
				i--;
				continue;
			}
			numArray[i]=r;
			System.out.print(numArray[i]+" ");
			if (i%10==0 && i!=0) {
				System.out.println();
			}
		}
		scanner.close();
	}
}
