package question06;

import java.util.Scanner;

public class PrintAlphabet {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("소문자 알파벳 하나를 입력하시오>>");
		String alphabet=scanner.next();
		char alphafirst=alphabet.charAt(0);
//		for (int j = 0; j <= alphafirst-97; j++) {
//			for (int i = 0; i <= alphafirst-97-j; i++) {
//				System.out.print((char)(97+i));
//			}
//			System.out.println();
//		}
		for (char i = alphafirst; i >= 'a'; i--) {
			for (char j = 'a'; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		scanner.close();
	}
}
