package chapter04;

// 동일한 패키지에서 중복된 클래스 이름이면 오류 
//class Circle{}
class Circle3{
//	4.멤버 저장됨
	int radius;
	public double getArea() {
		return 3.14*radius*radius;
	}
//	2.i를 radius=0
	public Circle3(int radius) {
//		3.매개변수를 멤버에 저장
		this.radius=radius;
	}
}
class Circle4{}
class Circle5{}
class Circle6{}
//public두개 이상 존재 불가 !!!
//public class Circle7{} 

public class CircleArray {
	public static void main(String[] args) {
		Circle3[] c;  //객체배열 Circle3을 참조변수c로 선언
		c=new Circle3[5]; //객체배열생성-> 참조변수 5개 크기(c[0]~c[4])(점5개생성)
		
		for (int i = 0; i < c.length; i++) {
//			1.i=0 ->객체생성->생성자 호출
			c[i]=new Circle3(i);//객체 생성(c[0]~c[4]참조변수가 객체가리킴)
		}
		for (int i = 0; i < c.length; i++) {
//			5개 객체의 각각의 메소드 호출해서 다른 원의 넓이를 구함
			System.out.println(c[i].getArea());
		}
	}
}
