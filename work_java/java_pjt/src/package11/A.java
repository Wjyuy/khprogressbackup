package package11;

public class A {
	//객체 생성
	A a1=new A(true);
	A a2=new A(1);
	A a3=new A("문자열"); //자기 클래스라서 private 가능
	
	//생성자
	public A(boolean b) {
	}
	//오버로딩 (타입이 다름)
	A(int b) { //default접근 지정자
	}
	private A(String s) {//private접근 지정자 
//	A(String s) { //default접근 지정자
	}
}
