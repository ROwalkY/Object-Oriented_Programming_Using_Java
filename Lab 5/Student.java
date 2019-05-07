
public class Student extends Person {

	String major;
	
	public Student(String name, String major) {
		
		super(name);
		
		this.major = major;
	}
	
	public double getSalary() {	
		return 0;
	}
	
	public String toString() {
		
		String result = "\n" + super.toString();
		
		result += "\nMajor: " + major + "\n";
		
		return result;
	}
}
