package chapter05;

class Weapon{
	protected int fire() {//스타크래프트-파이어뱃
		return 1;//기본공격력:1
	}
}
class Cannon extends Weapon{//스타크래프트-시즈탱크
	//무기 상속받아서 fire 오버라이딩 한거다.
	protected int fire() {
		return 10;//탱크 공격력:10
	}
}
public class Overriding {
	public static void main(String[] args) {
		
		Weapon weapon; 
		//참조변수 선언
//		Weapon weapon = new Weapon(); //객체 생성했죠
		weapon = new Weapon(); //객체 생성했죠
		System.out.println("기본 무기의 살상 능력은"+weapon.fire());//1 , 자기자신 객체니까 1나옴
		
		weapon = new Cannon(); //upcasting
//		System.out.println("대포의 살상 능력은"+weapon2.fire());
		System.out.println("대포의 살상 능력은"+weapon.fire());

		//이름을 계속 사용한다면 Weapon 삭제하면 사용가능?
		//int a b ; 지정해놓고 a= , b= 하는것처럼 Weapon 클래스 weapon 참조변수
		//weapon 으로 두개 지정하면 방향이 두개를 가리킴
		//모든 코드가 지났을때 위에있는 weapon 클래스는 가비지가 됨 화살표에 X표시.
		//업캐스팅-메소드ㅡ호출- 슈퍼클래스 -캐논 오버라이딩-10리턴 받아서 가져와서출력
		//return있어서 weapon2로 날아옴
		
		
	}
}
