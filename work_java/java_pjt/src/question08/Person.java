package question08;

public class Person {
	String lastName;
	String firstName;
	
	public String getLastName(String lname) {
		return lastName;
	}
	public String getFastName(String fname) {
		return firstName;
	}
	public int getLength() {
		return firstName.length()+lastName.length();
	}
	
}
