package question08;

public class Student {
	String Name;
	int Number;
	String Department;
	public String toString() {
		return ("이름: "+Name+"\n학번: "+Number+"\n소속학과: "+Department);
	}
	
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	
	public int getNumber() {
		return Number;
	}
	public void setNumber(int number) {
		Number = number;
	}
	
	public String getDepartment() {
		return Department;
	}
	public void setDepartment(String department) {
		Department = department;
	}
}
