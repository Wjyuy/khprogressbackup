package question10;

import java.util.Scanner;

public class PhoneBook {
	String[] names;
	String[] numbers;
	public PhoneBook(String[] name, String[] number) {
		this.names = name;
		this.numbers = number;
	}
	public String printPerson(String search) {
		for (int i = 0; i < names.length; i++) {
			if(names[i].equals(search)==true) {
				return numbers[i];
			}
		}
		return null;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("인원수>>");
		int count=scanner.nextInt();
		String[] name = new String[count];
		String[] number = new String[count];
		for (int i = 0; i < count; i++) {
			System.out.print("이름과 전화번호(이름과 번호는 빈 칸 없이 입력)>>");
			name[i]=scanner.next();
			number[i]=scanner.next();
		}
		System.out.println("저장되었습니다...");
		PhoneBook phonebook = new PhoneBook(name, number);
		while (true) {
			System.out.print("검색할 이름>>");
			String search=scanner.next();
			if (search.equals("그만")) {
				scanner.close();
				break;
			} else {
				String searchnumber=phonebook.printPerson(search);
				if (searchnumber!=null) {
					System.out.println(search+"의 번호는 "+searchnumber+" 입니다.");
				} else {
					System.out.println(search+" 이 없습니다.");
				}
			} 
		}
	}
}
