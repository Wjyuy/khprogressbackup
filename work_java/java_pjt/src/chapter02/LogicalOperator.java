package chapter02;

public class LogicalOperator {
	public static void main(String[] args) {
//		문자끼리 비교는 유니코드 크기로 비교됨
		System.out.println('a'>'b');
		System.out.println('a'<'b');
		
		System.out.println(-1 < 0);
		System.out.println(3 >= 2);
		System.out.println("==================");
		System.out.println(3.45<=2);
		System.out.println(3 == 2);
		System.out.println(3 != 2);
		System.out.println(!(3 != 2));
		System.out.println("==================");
//		and= 참&&거짓=거짓
		System.out.println((3>2) && (3>4));
//		or= 참||거짓=참
		System.out.println((3>2) || (-1>0));
//		xor= 참^거짓=참 (두개가 다르면 참)
		System.out.println((3>2) ^ (-1>0));
	}
}
