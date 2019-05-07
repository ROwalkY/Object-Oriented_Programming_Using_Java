public class ForeignStudent extends Student {

	private String countryOfOrigin;
	private MyDate dateOfEntryToCanada;
	
	public ForeignStudent(String studentName, int numberOfCoursesTaken, String countryOfOrigin, MyDate dateOfEntryToCanada) {
		super(studentName, numberOfCoursesTaken);
		this.countryOfOrigin = countryOfOrigin;
		this.dateOfEntryToCanada = dateOfEntryToCanada;
	}

	
	public double computeFees() {
		return numberOfCoursesTaken * 1000.0;
	}

	
	public boolean lessThan(Sortable anotherStudent) {
		if(anotherStudent instanceof SeniorStudent) {
			return false;
		} else if(anotherStudent instanceof ForeignStudent) {
			return studentName.compareTo(((ForeignStudent) anotherStudent).studentName) < 0;
		} else {
			return true;
		}
	}

	
	public String findCountry() {
		return countryOfOrigin;
	}
	
}
