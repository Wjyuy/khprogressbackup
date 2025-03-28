package chapter02;

public class Ramyun {
	public static void main(String[] args) {
//		객체 지향적이기 때문에 호출할때 순서를 정할 수 있다
		buy();
		boil();
		put();
		eat();
	}
	public static void boil() {
		System.out.println("물을 끓인다.");
	}
	public static void buy() {
		System.out.println("라면을 사온다.");
	}
	public static void eat() {
		System.out.println("맛있게 먹는다.");
	}
	public static void put() {
		System.out.println("라면을 넣는다.");
	}
}
