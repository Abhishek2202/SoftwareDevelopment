package SD1;

public class Student {
	
	private String name;
	private int id;
	private String phone;
	private String address;
	private int age;
	private String department;
	
	
	//Constructor
	public Student(int i, String n) {
		id = i;
		name = n;	
	}
	
	//Mutators and access methods
	public String getName() {
		return name;
	}
	
	public int getId() {
		return id;
	}
	
	public void setAddress(String a) {
		address = a;
	}
	
	public String getAddress() {
		return address;
	}
	
	protected void setPhone(String p) {
		phone = p;
	}

	protected String getPhone() {
		return phone;
	}
	
	public void setAge(int ag) {
		age = ag;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setDepartment(String d) {
		department = d;
	}
	
	public String getDeaprtment() {
		return department;
	}
	
	public static void main() {	
	}
}
