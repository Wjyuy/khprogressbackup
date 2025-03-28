package question08;

import java.util.Scanner;

class Add{
	int a;
	int b;
	void setValue(int a, int b) {
		this.a=a;
		this.b=b;
	}
	int calculate() {return a+b;}
}
class Sub{
	int a;
	int b;
	void setValue(int a, int b) {
		this.a=a;
		this.b=b;
	}
	int calculate() {return a-b;}
}
class Mul{
	int a;
	int b;
	void setValue(int a, int b) {
		this.a=a;
		this.b=b;
	}
	int calculate() {return a*b;}
}
class Div{
	int a;
	int b;
	void setValue(int a, int b) {
		this.a=a;
		this.b=b;
	}
	int calculate() {
		int res=0;
		try {
			res=a/b;
		} catch (Exception e) {
		}
		return res;
		}
}

public class Calc {
	public static void main(String[] args) {
		System.out.print("두 정수와 연산자를 입력하시오>>");
		Scanner scanner=new Scanner(System.in);
		int num1=scanner.nextInt();
		int num2=scanner.nextInt();
		String cal=scanner.next();
		switch (cal) {
		case "+":
			Add add= new Add();
			add.setValue(num1, num2);
			System.out.println(add.calculate());
			break;
		case "-":
			Sub sub= new Sub();
			sub.setValue(num1, num2);
			System.out.println(sub.calculate());
			break;
		case "*":
			Mul mul= new Mul();
			mul.setValue(num1, num2);
			System.out.println(mul.calculate());
			break;
		case "/":
			Div div= new Div();
			div.setValue(num1, num2);
			if (num2==0) {
				System.out.println("0으로 나눌수 없습니다.");
			}else {
				System.out.println(div.calculate());
			}
			break;
		default:
			System.out.println("연산자 잘못 입력 ");
			break;
		}
		scanner.close();
	}

}
