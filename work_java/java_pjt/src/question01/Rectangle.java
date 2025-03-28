package question01;

import java.util.Scanner;

public class Rectangle {

	public static void main(String[] args) {
		System.out.print("점(x,y)의 좌표를 입력하시오 >>");
		Scanner scanner = new Scanner(System.in);
		int x= scanner.nextInt();
		int y= scanner.nextInt();
		
		if((x>=100 && y>=100) &&(x<=200 && y<=200)) {
			System.out.println("("+x+","+y+")는 사각형 안에 있습니다.");
		}
		scanner.close();
	}

}
