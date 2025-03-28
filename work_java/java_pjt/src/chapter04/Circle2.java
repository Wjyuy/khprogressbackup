package chapter04;

public class Circle2 {
//	4.멤버변수가 1
//	4.매개변수 값이 멤버변수로 저장됨
	int radius;//10
	String name;//"자바피자"
	public double getArea() {
		return 3.14*radius*radius;
	}
//	2.생성자 호출됨
	public Circle2() {
//		3.반지름이 1
		radius=1;
		name="";
	}
//	오버로딩(ex> 생성자 2개)
//	매개변수, 멤버변수 같을때 this 사용하면 경고창 없애준다
//	2.생성자 호출됨(매개변수를 받음)
	public Circle2(int radius,String n) {
//		3.매개변수 값이 저장
		this.radius=radius;//10
		name=n;//"자바피자"
	}
	public static void main(String[] args) {
//		레퍼런스(참조)변수 선언
//		Circle2 pizza;
//		객체 생성하면서 생성자 호출(기본 생성자 없으면 자동으로 생성해서 호출)
//		기본생성자 외에 다른 생성자가 있으면 생성하지 못해서 컴파일 오류
//		new Circle2();
		
//		1.객체 생성하면서 생성자 호출
		/*
		Circle2 pizza=new Circle2(); //반지름:1 , name=""(null) 피자 생성
		double area=pizza.getArea();
		System.out.println(area);
		*/
		
//		매개변수 1개를 가지는 생성자는 없어서 오류
//		new Circle2(10);
//		1.객체 생성하면서 생성자 호출(매개변수 10,"자바피자" 2개를 들고 감)
		Circle2 pizza= new Circle2(10,"자바피자");//반지름10,이름은 자바피자인 pizza 객체 생성
		double area=pizza.getArea();
		System.out.println(pizza.name+"의 면적은 "+area);
		
		Circle2 donut= new Circle2(10,"");
		donut.name="자바도넛"; //생성자 매개변수에 넣어도 되고 필드에 별도로 줄 수도 있다.
		area=donut.getArea();
		System.out.println(donut.name+"의 면적은 "+area);
		
	}
}
