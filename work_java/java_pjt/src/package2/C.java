package package2;

//import package1.A;
//다른 패키지에 클래스는 import 해서 사용(public인경우) 
import package1.B;

public class C {
	B b;
//	default 접근지정자는 다른패키지에서 접근 시 오류 
//	A a;
}
