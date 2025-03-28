package question03;

import java.util.Scanner;

public class BreakExample {
	public static void main(String[] args) {
		System.out.println("exit을 입력하면 종료합니다.");
		Scanner scanner = new Scanner(System.in);
		while (true) {
			String Exit=scanner.next();
//			System.out.println(Exit);
			if(Exit.equals("exit")) {
				System.out.println("종료합니다...");
				scanner.close();
				break;
			}
		}
	}
}
