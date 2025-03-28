package chapter02;

public class EscapeExample {
	public static void main(String[] args) {
		System.out.println("번호이름직업 ");
//		\t : 탭 만큼 띄움
//		print:  엔터 적용 안됨
//		System.out.print("번호\t이름\t직업");
//		println: 엔터 적용 ( print line )
		System.out.println("번호\t이름\t직업");
		
//		\n : 엔터(다음행)
		System.out.print("번호\t이름\t직업\n");
		System.out.print("번호\t이름\t직업");
		System.out.println(); //엔터
//		System.out.print("번호\t이름\t직업");
		
		System.out.println("우리는 개발자 입니다.");
//		오류 : Syntax error on token "개발자", invalid AssignmentOperator
//		System.out.println("우리는 "개발자" 입니다.");
		System.out.println("우리는 \"개발자\" 입니다."); //""출력
		
		System.out.println("봄여름가을겨울");
//		\를 넣으면 특수자로 인식되어서 \\을 쓰면 \ 출력 됨!
		System.out.println("봄\\여름\\가을\\겨울");  
	}
}
