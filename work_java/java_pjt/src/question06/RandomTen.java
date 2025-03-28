package question06;

import java.util.Random;

public class RandomTen {
	public static void main(String[] args) {
		Random random = new Random();
		int[] randomArray= new int[10];
		double sum=0;
		System.out.print("랜덤한 정수들 : ");
		for (int i = 0; i < randomArray.length; i++) {
			randomArray[i]=(int)(random.nextDouble()*10)+1;
			System.out.print(randomArray[i]+" ");
			sum+=randomArray[i];
		}
		System.out.println();
		System.out.println("평균은 "+sum/randomArray.length);
	}
}
