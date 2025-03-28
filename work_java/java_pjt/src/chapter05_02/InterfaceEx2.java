package chapter05_02;

interface PhoneInterface2{
	int TIMEOUT=100;  
	void sendCall();   
	void receiveCall();
	default void printLogo() {
		System.out.println("** Phone **");
	}
}
//PCS(ex>016,018,019)
//인터페이스 간의 상속 => extends 사용
//문자를 보내고 받는 기능을 추상메소드로 선언 
interface MobilePhoneInterface extends PhoneInterface2{
	void sendSMS();
	void receiveSMS();
}
//MP3플레이어 : 음악재생,정지 기능을 추상메소드로 선언 
interface MP3Interface{
	void play();
	void stop();
}
class PDA{
	public int calculate(int x, int y) {
		return x+y;
	}
}
//아이폰: 계산기능,문자전송,음악기능을 상속받음 
class SmartPhone extends PDA implements MobilePhoneInterface,MP3Interface{
	@Override
	public void sendCall() {
		System.out.println("띠리리리링");
	}
	@Override
	public void receiveCall() {
		System.out.println("전화가 왔습니다.");
	}
	@Override
	public void play() {
		System.out.println("음악을 연주합니다.");
	}
	@Override
	public void stop() {
		System.out.println("음악을 중단합니다.");
	}
	@Override
	public void sendSMS() {
		System.out.println("문자 갑니다.");
	}
	@Override
	public void receiveSMS() {
		System.out.println("문자 왔어요.");
	}
	public void schedule() {
		System.out.println("일정 관리합니다.");
	}
}
public class InterfaceEx2 {
	public static void main(String[] args) {
		SmartPhone phone =new SmartPhone();
		phone.printLogo();
		phone.sendCall();
		phone.play();
		System.out.println(phone.calculate(3, 5)); //8
		phone.schedule();
	}
}
