package question07;

/*String[]사용
메소드호출해서 문자열 변경
*/

public class ArrayParameterEx {
//	문자열 배열을 매개변수로 받아서 출력
	static void printStringArray(String a[]) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]);
		}
		System.out.println();
	}
//	문자열 배열을 매개변수로 받아서 be -> eat 변경 
	static void replaceBe(String a[]) {
		for (int i = 0; i < a.length; i++) {
			if(a[i].equals("be")) {
				a[i]="eat";
			}
		}
	}
	
	public static void main(String[] args) {
		String s[]= {"to"," ","be"," ","or"," ","not"," ","to"," ","be"};
		printStringArray(s);
		replaceBe(s);
		printStringArray(s);
	}
//	String[] array;
//	
//	public ArrayParameterEx(String[] str) {
//		this.array = str;
//	}
//	
//	public void printStringArray() {
//		System.out.println(array);
//	}
//	public void replaceBe() {
//	}
//	public static void main(String[] args) {
//		StringBuffer sb=new StringBuffer("to be or not to be");
//		System.out.println(sb);
//		if(sb.equals("be")) {
//			System.out.println(sb);
//			
//		}
//	}

	
}
