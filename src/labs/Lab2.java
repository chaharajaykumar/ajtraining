package labs;

public class Lab2 {

	public static void main(String[] args) {
		// create student
		Student stu1= new Student("Jain","12345678");
		Student stu2= new Student("pain","12545678");
		Student stu3= new Student("gain","12645678");
	}

}

class Student {
	//Properties
	private static int iD = 1000;
	private String name;
	private String userId;
	private String ssn;
	private String email;
	
	public Student(String name, String ssn) {
		iD++;
		this.name = name;
		this.ssn = ssn;
		setUserId();
		setEmail();
	}
	private void setEmail() {
		email = name.toLowerCase() + "." + iD + "@ajsuni.com";
		System.out.println("your email: " + email);
	}
	private void setUserId() {
		int max= 9000;
		int min= 1000;
		int randNum = (int) (Math.random() * ((max - min)));
		randNum = randNum + min;
		userId = iD + "" + randNum + ssn.substring(5);
		System.out.println("your userid is " + userId);
	}
}
