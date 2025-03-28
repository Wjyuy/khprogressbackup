package question06;

import java.util.Random;
import java.util.Scanner;

public class guessNumber {
	public static void main(String[] args) {
		int numberToGuess;
		int guess;
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);
		numberToGuess=(int)(random.nextDouble()*10)+1;
		for (;;) {
			System.out.print("추측한 숫자를 입력하세요: ");
			guess=scanner.nextInt();
			if (guess==numberToGuess) {
				System.out.println("맞추셨습니다");
				scanner.close();
				break;
			} else if (guess>numberToGuess) {
				System.out.println("추측한 숫자가 너무 큽니다");
			}else {
				System.out.println("추측한 숫자가 너무 작습니다");
			}
		}
	}
}
