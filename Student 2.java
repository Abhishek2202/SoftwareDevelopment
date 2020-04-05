package Assignment;

	
	import java.io.*;


	public class Student extends forAddress {
	    private String name="Jagrati";
	    private int id=1;
	    private String phone;
	    private int age;
	    private String department;

	    public void Student(int id, String name){
	        id=1;
	        name="Jagrati";
	    }
	    public String getName() {
	        return name;
	    }
	    public int getId() {
	        return id;
	    }

	    protected void setPhone(String phoneNumber){
	        phone=phoneNumber;
	    }
	    protected String getPhone(){
	        return phone;
	    }
	    public void setAge(int ageStudent){
	        age=ageStudent;
	    }
	    public int getAge(){
	        return age;
	    }
	    public void setDepartment(String dept){
	        department=dept;
	    }
	    public String getDepartment(){
	        return department;
	    }
	    public void printStudentInfo(){
	        System.out.println("Student ID: "+getId());
	        System.out.println("Student Name: "+getName());
	        System.out.println("Student Age: "+getAge());
	        System.out.println("Student Department: "+getDepartment());
	        System.out.println("Student Phone: "+getPhone());
	        System.out.println("Student Address: "+getAddress());
	    }

	    public static void main(String[] args) {

	        Student student = new Student();
	        student.Student(1,"Jagrati");
	        student.setPhone("123456789");
	        student.setAge(20);
	        student.setDepartment("ITWS");
	        student.setAddress("RPI");
	        student.printStudentInfo();
	    }


	}

