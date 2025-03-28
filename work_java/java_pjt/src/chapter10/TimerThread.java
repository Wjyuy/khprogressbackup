package chapter10;

public class TimerThread extends Thread{
	int n=0;
	public void run() {
		while (true) {
			System.out.println(n);
			n++;
			try {
				//1초마다 실행
				sleep(1000);
//				예외 발생할때 e로 catch
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
//				printStackTrace메소드로 예외처리 기본 메시지 출력
				e.printStackTrace();
			}
		}
	}
}
