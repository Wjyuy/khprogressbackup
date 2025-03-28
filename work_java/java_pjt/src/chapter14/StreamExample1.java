package chapter14;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample1 {
	public static void main(String[] args) {
		List<String> words= Arrays.asList("Java","Stream","Library");
		System.out.println("입력데이터="+words);
		List<Integer> result= words.stream()
			.map(String::length)//메소드 참조로 문자열 길이 구함 
			.collect(Collectors.toList());
		System.out.println("실행결과="+result);//실행결과=[4, 6, 7]
		
	}
}
