package chapter03;
/*
 * 배열 리턴(메소드 이용)*/
public class ReturnArray {
//	static int[] makeArray() {}
//	makeArray() : 메소드
//	int[] : 리턴타입(리턴 없으면 오류)
	
//	리턴 타입에 배열크기를 표시하면 오류
//	static int[4] makeArray() {
	static int[] makeArray() {
// 		배열 생성시 타입 불일치시 오류		
//		int temp[]=new String[4];
		int temp[]=new int[4];
		
//		temp.length:4
		for (int i = 0; i < temp.length; i++) {
			temp[i]=i; //0,1,2,3
		}

//		리턴 타입과 반환되는 값 타입일치 x( 배열과 int 는 달라용 ) 
//		return 0;
//		return temp[]; //리턴에 [] 하면 오류
		return temp; 
	}
	public static void main(String[] args) {
		int intArray[];
//		메소드호출
		intArray=makeArray(); //temp 배열 받음 // 0 1 2 3
		for (int i = 0; i < intArray.length; i++) {
			System.out.print(intArray[i]+" ");
		}
	}
}	
