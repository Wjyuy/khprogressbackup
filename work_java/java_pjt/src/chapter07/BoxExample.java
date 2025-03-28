package chapter07;

public class BoxExample {
	public static void main(String[] args) {
		Box box = new Box();
		Object box2 = new Box();
		box.set("홍길동");
//		down casting(String)
		String name= (String) box.get();
		System.out.println(name);
		
		box.set(777);
//		down casting(object -> int)
		int number= (int) box.get();
		System.out.println(number);
		
		box.set(new Apple());
//		down casting(Apple)
		Apple apple = (Apple) box.get();
//		chapter07.Apple@5ca881b5
		System.out.println(apple);
	}
}
