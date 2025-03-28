package chapter14;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Product{
	int id;
	String name;
	int price;
	public Product(int id, String name, int price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}
}

public class StreamTest {
	public static void main(String[] args) {
		List<Product> list=new ArrayList<>(); //upcasting으로 ArrayList 객체생성 
		list.add(new Product(1, "NoteBook", 100));
		list.add(new Product(2, "TV", 320));
		list.add(new Product(1, "Washing Machine", 250));
		list.add(new Product(1, "Air Conditioner", 500));
		
		List<String> result = list.stream()
			.filter(p->p.price>300)//가격이 300 초과한 제품을 추출
			.map(p->p.name)//추출한 제품 이름
			.collect(Collectors.toList());//리스트로 받는다
		System.out.println(result);
	}
}
