package question10;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//import java.util.Scanner;
//import java.util.stream.Collectors;
//
//class Member3{
//	private String id;
//	private String name;
//	private String map;
//	public Member3(String id, String name, String map) {
//		this.id = id;
//		this.name = name;
//		this.map = map;
//	}
//	public String getId() {
//		return id;
//	}
//	public String getName() {
//		return name;
//	}
//	public void setId(String id) {
//		this.id = id;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public void setMap(String map) {
//		this.map = map;
//	}
//	public String getMap() {
//		return map;
//	}
//}
public class MemberAct2immade {
//	private Member[] mArray;
//	Scanner scanner =new Scanner(System.in);
//	public int printfirst() {
//		System.out.println("=====헬스클럽 회원관리 프로그램=====");
//		System.out.println("1.회원 정보관리 | 2.프로그램 종료");
//		System.out.println("====================================");
//		System.out.println("메뉴를 선택하세요. >>>>");
//		int choose=scanner.nextInt();
//		return choose;
//	}
//	public int printtwo() { 
//		System.out.println("=====일반회원 정보관리=====");
//		System.out.println("11.일반회원 정보입력 | 22.일반회원 정보삭제 | 33.일반회원 정보확인 | 0.이전단계");
//		System.out.println("====================================");
//		System.out.println("메뉴를 선택하세요. >>>>");
//		int choose=scanner.nextInt();
//		return choose;
//	}
//	public void input() {
//		System.out.println("가입할 회원 수를 입력하세요>>");
//		int count =scanner.nextInt();
//		mArray = new Member[count];
//		for (int i = 0; i < count; i++) {
//			System.out.println("회원정보를 입력하세요.");
//			System.out.print("회원 아이디:");
//			String id =scanner.next();
//			System.out.print("회원 이름:");
//			String name =scanner.next();
//			System.out.print("회원 지역:");
//			String map =scanner.next();
//			mArray[i]=new Member(id,name,map);
//		}
//	}
//	public void del() {
//		System.out.println("삭제할 회원번호를 입력하세요.>>");
//		int number =scanner.nextInt();
//		System.out.println("회원 번호:"+number);
//		System.out.println("회원 아이디:"+(mArray[number-1].getId()));
//		mArray[number-1].setId(null);
//		System.out.println("회원 이름:"+(mArray[number-1].getName()));
//		mArray[number-1].setName(null);
//		System.out.println("회원 지역:"+(mArray[number-1].getMap()));
//		mArray[number-1].setMap(null);
//		}
//	public void search() {
//		System.out.println("등록된 회원수는 "+mArray.length+"입니다.");
//		for (int i = 1; i < mArray.length+1; i++) {
//			System.out.println("회원 번호:"+i);
//			System.out.println("회원 아이디:"+(mArray[i-1].getId()));
//			System.out.println("회원 이름:"+(mArray[i-1].getName()));
//			System.out.println("회원 지역:"+(mArray[i-1].getMap()));
//		}
//	}
//	public void run() {
//		while (true) {
//			int choose1=printfirst();
//			if (choose1==2) {
//				break;
//			} else {
//				while (choose1==1) {
//					int choose2=printtwo();
//					if(choose2==11) {input();}
//					if(choose2==22) {del();}
//					if(choose2==33) {search();}
//					if(choose2==0) {choose1=0;}
//				}
//			}
//		}
//	}
	public static void main(String[] args) {
//		new MemberAct2immade().run();
	}
}
