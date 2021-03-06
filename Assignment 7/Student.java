public abstract class Student implements FeeCalculator, Sortable {

	private static int totalStudents = 0;

	private int studentNumber;
	protected int numberOfCoursesTaken;
	protected String studentName;

	public Student(String studentName, int numberOfCoursesTaken) {
		totalStudents++;
		this.studentNumber = totalStudents;

		this.studentName = studentName;
		this.numberOfCoursesTaken = numberOfCoursesTaken;
	}

	public abstract String findCountry();

	public String toString() {
		return "Student #" + studentNumber + ", Name: " + studentName + " is from " + findCountry() + ", pays fees $"
				+ computeFees();
	}
}
