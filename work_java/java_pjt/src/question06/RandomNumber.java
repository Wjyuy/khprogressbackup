package question06;

import java.util.Random;

public class RandomNumber {
	public static void main(String[] args) {
		int rNumber;
		Random random = new Random();
		for (int i = 0; i < 50; i++) {
			rNumber=(int)(random.nextDouble()*10)+1;
			System.out.println(rNumber);	
			if(rNumber==7) {
				break;
			}
		}
	}
}
