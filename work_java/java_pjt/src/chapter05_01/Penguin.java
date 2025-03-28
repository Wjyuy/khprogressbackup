package chapter05_01;

//객체 생성 시 멤버 5개
//extends Bird,Swim : 자바클래스 다중 상속 불가
//public class Penguin extends Bird,Swim{ //오류
//인터페이스 다중상속 됨(implements 키워드 사용)
//생명1개 날개2개 걷다 먹는다 +수영한다(인터페이스)
public class Penguin extends Bird implements Swim2{
	@Override
	public void swim() {
			System.out.println("Penguins swim.");
	} 
//		public void swim() {
//		System.out.println("Penguins swim.");
//		}
	
}
