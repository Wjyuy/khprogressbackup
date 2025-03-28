package chapter14;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class MainTest3 {
	public static void main(String[] args) {
		List<String> sList=new ArrayList<>();
		sList.add("Tomas");
		sList.add("Edward");
		sList.add("Jack");
		
		Stream<String> stream= sList.stream();
		stream.forEach(s->System.out.print(s+" "));
		System.out.println("\n-----------------");
		
//		정렬하는 기능(오름차순) -> sorted
//		알파벳순으로 정렬S
		sList.stream().sorted().forEach(s->System.out.print(s+" "));
		System.out.println("\n-----------------");
		
//		데이터를 변형할때 사용하는 map->길이로 변경!
//		원본 데이터는 정렬되지 않았기 때문에, 
//		Tomas Edward Jack 순인 5 6 4 출력됨 
		sList.stream().map(s->s.length()).forEach(s->System.out.print(s+" "));
		System.out.println("\n-----------------");
		
//		filter(s->s.length() >=5) 이름의 길이가 5글자 이상인 경우만 남김
		sList.stream().filter(s->s.length() >=5).forEach(s->System.out.print(s+" "));
	}
}
