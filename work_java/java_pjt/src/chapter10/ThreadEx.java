package chapter10;

class ThreadEx1 extends Thread{
	public void run() {//스레드 구현 (start 메소드 시작하면 시작됨)
		for (int i = 0; i < 5; i++) {
			System.out.println("i: "+i);
		}
	}
}
class ThreadEx2 implements Runnable{ //스레드는 왔다갔다 실행되기 때문에 비동기식으로 동작함.
	public void run() {
		for (int j = 10; j < 15; j++) {
			System.out.println("j: "+j);
		}
	}
}
public class ThreadEx {
	public static void main(String[] args) {
		//스레드 객체 생성
		ThreadEx1 t1=new ThreadEx1();
		
//		Thread t2=new Thread(new ThreadEx2()); //Runnable인터페이스 생성자 1번방식
		//2번방식 
		Runnable r =new ThreadEx2(); 
		Thread t2=new Thread(r);
		t1.start();
		t2.start();
	}
}
