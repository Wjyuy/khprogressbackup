package chapter06;

public class AutoBoxingUnBoxingEx {
	public static void main(String[] args) {
		int n=10;
//		n을 값으로 가지는 객체 생성(intObjext:참조변수)
		Integer intObject=Integer.valueOf(n);//boxing
		Integer intObject2=n;// auto boxing
//		10출력
		System.out.println(""+intObject);
		System.out.println(""+intObject2);
		
//		int m = intObject.intValue()+intObject.intValue();//unboxing
		int m = intObject+intObject; //auto unboxing
		System.out.println("m= "+m);//m=20
	}
}
