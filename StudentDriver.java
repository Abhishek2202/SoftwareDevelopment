package SD1;

public class StudentDriver {
	
	public static void main(String[] args) {
		
		//Instantiates the payroll object with 2 argument constructor
		Student s1 = new Student(1, "Abhishek Gupta");
		
		//set student info
		s1.setAddress("89 14th St, Troy, NY");
		s1.setAge(24);
		s1.setDepartment("ITWS");
		s1.setPhone("5185459572");
		
		//get student info
		System.out.println("Student Info: " + "\n" + 
		"Name: " + s1.getName() + "\n" +
		"ID: " + s1.getId() + "\n" + 
		"Address: " + s1.getAddress() + "\n" +
		"Age: " + s1.getAge() + "\n" +
		"Department: " + s1.getDeaprtment() + "\n" + 
		"Phone: " + s1.getPhone()
		);
	}

}
