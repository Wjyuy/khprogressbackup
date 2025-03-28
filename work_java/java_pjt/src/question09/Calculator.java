package question09;

import java.util.Scanner;

abstract class Calc{
	protected int a,b;
	public void setValue(int a,int b) {this.a=a;this.b=b;}
	public abstract int calculate();
}
class Add extends Calc{
	@Override
	public int calculate() {return a+b;}
}
class Sub extends Calc{
	@Override
	public int calculate() {return a-b;}
}
class Mul extends Calc{
	@Override
	public int calculate() {return a*b;}
}
class Div extends Calc{
	@Override
	public int calculate() {
		try {
			return a/b;
		} catch (Exception e) {
			return 0;
		}
	}
}
public class Calculator {
	public static void main(String[] args) {
		System.out.print("두 정수와 연산자를 입력하시오>>");
		Scanner scanner = new Scanner(System.in);
		int a=scanner.nextInt();
		int b=scanner.nextInt();
		char operator=scanner.next().charAt(0);
		Calc exp=null;
		switch (operator) {
		case '+': exp=new Add();break;
		case '-': exp=new Sub();break;
		case '*': exp=new Mul();break;
		case '/': exp=new Div();break;
//		case '+': Add add=new Add(a,b);add.setValue(a, b);System.out.println(add.calculate());break;
//		case '-': Sub sub=new Sub(a,b);sub.setValue(a, b);System.out.println(sub.calculate());break;
//		case '*': Mul mul=new Mul(a,b);mul.setValue(a, b);System.out.println(mul.calculate());break;
//		case '/': Div div=new Div(a,b);div.setValue(a, b);
//		if (div.calculate()==0) {System.out.println("0으로 나눌 수 없습니다.");}
//		else {System.out.println(div.calculate());}break;
		default:
			System.out.println("연산자 잘못 입력");scanner.close();break;
		}
		exp.setValue(a, b);
		if (exp instanceof Div &&b==0) {
			System.out.println("0으로 나눌 수 없습니다.");
		} else {
			System.out.println(exp.calculate());
		}
//		if (operator=='/' && b==0) {
//			System.out.println("0으로 나눌 수 없습니다.");
//		} else {
//			System.out.println(exp.calculate());
//		}
		scanner.close();
	}
}
