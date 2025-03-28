package chapter13;

interface MyFunction2{
	int calc(int x);// 람다식으로 구현할 추상 메소드 
}

public class LambdaEx2 {
	public static void main(String[] args) {
//		MyFunction2 square=(x)->{return x*x;}; //람다식
//		MyFunction2 square=(x)->x*x; //람다식
		MyFunction2 square=x->x*x; //매개변수 1개면 ()도 생략 
		System.out.println(square.calc(3));
	}
}
