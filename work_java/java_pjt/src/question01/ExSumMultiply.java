package question01;

import java.util.Scanner;

public class ExSumMultiply {

	public static void main(String[] args) {
		System.out.print("3자리수 정수 입력(100~999)>>");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		int hund=num/100;
		int ten=(num/10)-hund*10;
//		int ten=(hund%10)/10; //와 위랑 같다(100나누기 한 나머지에서 10을 나눈 것)
		int one=num%10;
//		System.out.println(hund+" "+ten+" "+one);
		System.out.println("100의 자리와 10의 자리의 합은 "+(hund+ten));
		System.out.println("10의 자리와 1의 자리의 곱은 "+ten*one);
		scanner.close();

	}

}
