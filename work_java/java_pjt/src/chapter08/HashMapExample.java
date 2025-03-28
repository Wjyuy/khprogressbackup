package chapter08;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {
	public static void main(String[] args) {
//		Map 컬렉션: 구조가 키, 값으로 구성
//		Map 인터페이스 타입으로 HashMap 클래스 객체 생성(키:문자열,값:정수형 Wrapper클래스)
		Map<String, Integer> map=new HashMap<>();//upcasting
		map.put("임영웅", 31);
		map.put("영탁", 38);
		map.put("이잔원", 25);
//		map.put("임영웅", 30); //키는 중복 안됨
		map.put("김호중", 31); //값은 중복 허용 
		map.put("정동원", 14); //값은 중복 허용 
		System.out.println("총 Entry 수: "+map.size());//Map.Entry구조로 키/값으로 구성
		System.out.println("임영웅: "+map.get("임영웅"));//키에 대한 값 출력
		System.out.println();
		
		Set<String> keySet= map.keySet(); //map 컬렉션의 모든키를 Set 컬렉션으로 받음
		Iterator<String> keyIterator= keySet.iterator();
		
//		Map컬렉션 키/값을 가져오는 1번째 방식
		while (keyIterator.hasNext()) {//컬렉션 객체가 있으면 참
			String key = (String) keyIterator.next(); //컬렉션 객체를 가져옴
			Integer value= map.get(key); //get()메소드로 Map컬렉션의 키를 가지고 값을 가져옴
//			출력순서는 랜덤으로 발생(인덱스개념 없어서)
			System.out.println("\t"+key+": "+value);
		}
		System.out.println();
		map.remove("임영웅");
		System.out.println("총 Entry 수: "+map.size());

//		Map.Entry 구조로 키/값으로 객체를 받음 
		Set<Map.Entry<String, Integer>> entrySet= map.entrySet();
//		Set 컬렉션 방식으로 객체 처리(키,값을 가져옴)
		Iterator<Map.Entry<String, Integer>> entryIterator= entrySet.iterator();
//		Map컬렉션 키/값을 가져오는 2번째 방식
		while (entryIterator.hasNext()) { //컬렉션 객체가 있으면 참 
			Map.Entry<String,Integer> entry = entryIterator.next();//컬렉션 객체를 가져옴
			String key= entry.getKey();//키를 가져옴
			Integer value= entry.getValue();//값을 가져옴
			System.out.println("\t"+key+": "+value);
		}
		System.out.println();
		map.clear();
		System.out.println("총 Entry 수: "+map.size());
	}
}
