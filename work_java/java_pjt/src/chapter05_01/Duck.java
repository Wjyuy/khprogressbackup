package chapter05_01;

//생명1개 날개2개 걷다 먹는다 +수영한다 +날다(인터페이스 다중 상속)
public class Duck extends Bird implements Swim2,Fly{
//	public void swim() {
//		System.out.println("ducks swim.");
//	}
//	public void fly() {
//		System.out.println("ducks fly.");
//	}
	@Override
	public void swim() {
		System.out.println("ducks swim.");
	}
	@Override
	public void fly() {
		System.out.println("ducks fly.");
		
	}
}
