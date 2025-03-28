package package12;

import package11.A;

public class C {
	A a1=new A(true); //public 인데 다른 패키지면 -> import 
//	A a2=new A(1); //default접근지정자는 다른패키지에서 접근 X  
//	A a3=new A("문자열"); //private 다른패키지에서 안됨
}
