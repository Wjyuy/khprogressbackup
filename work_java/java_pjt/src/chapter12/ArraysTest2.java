package chapter12;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArraysTest2 {
	public static void main(String[] args) {
		String[] a= {"a","b","c","d"};
		int[] b= {1,5,5,7,3,3,42,6,8,45523,4,63,2,1};
		System.out.println(a); //배열객체 출력
		System.out.println(Arrays.asList(a)); //List로 변환(해서출력)
		List<String> list =Arrays.asList(a);
		System.out.println("@#list.get(0) -> "+list.get(0));
		
		Arrays.sort(b, 4,14); //인덱스정렬(4~13까지)
		System.out.println(Arrays.toString(b));// string 으로 (출력)
//		[1, 5, 5, 7, 1, 2, 3, 3, 4, 6, 8, 42, 63, 45523]
		
		Arrays.sort(b); //오름차순 정렬
		System.out.println(Arrays.toString(b));
//		[1, 1, 2, 3, 3, 4, 5, 5, 6, 7, 8, 42, 63, 45523]
		
		Arrays.sort(a,Collections.reverseOrder());//문자열 배열을 내림차순 
//		[d, c, b, a]
		System.out.println(Arrays.toString(a));
		
		Arrays.sort(a); //[a, b, c, d]
		System.out.println(Arrays.toString(a));
		
//		[a, b, d, c] 2에서 3까지 반대로 
		Arrays.sort(a,2,4,Collections.reverseOrder());
		System.out.println(Arrays.toString(a));
		
		String[] cc= {"11","12","13","23","53","223","145","53"};
		Arrays.sort(cc,Collections.reverseOrder());
//		[53, 53, 23, 223, 145, 13, 12, 11] String 이라서 5가 앞에 있는 애가 더 큰가 보다 
		System.out.println(Arrays.toString(cc));
		
		int[] c= Arrays.copyOf(b, b.length);//배열객체를 복사(화살표복사 아니고 통째로) 
//		[1, 1, 2, 3, 3, 4, 5, 5, 6, 7, 8, 42, 63, 45523]  b를 고대로 훔쳐왔다 
		System.out.println(Arrays.toString(c));
		
		String[] d= Arrays.copyOf(a, 3);//a배열객체를 크기3인 배열로 복사 
		System.out.println(Arrays.toString(d)); //통째로 복사해서 이 둘은 다르다 [a, b, d]
		System.out.println(Arrays.toString(a)); //[a, b, d, c]
	}
}
