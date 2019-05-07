
public class ForeignStudent extends Student{

	private String countryOfOrigin;
	
	private MyDate dateOfEntryToCanada;
	
	public ForeignStudent(String studentName, int numberOfCoursesTaken,
			String countryOfOrigin, MyDate dateOfEntryToCanada) {
		
		super(studentName, numberOfCoursesTaken);
		
		this.countryOfOrigin = countryOfOrigin;
		
		this.dateOfEntryToCanada = dateOfEntryToCanada;
		
	}
	
	public String findCountry() {
		
		return countryOfOrigin;
		
	}
	
	public double computeFees() {
		
		return numberOfCoursesTaken*1000;
		
	}
	
	public boolean lessThan(Sortable object) {
		
		if(object == null) {
			
			return false;
			
		}else if(object instanceof SeniorStudent){
			
			return false;
			
		}else if(object instanceof CanadianStudentUnder65) {
			
			return true;
			
		}else if(object instanceof ForeignStudent) {
			
			ForeignStudent temp = (ForeignStudent)object;
			
			if(this.studentName.compareTo(temp.studentName) < 0) {
				
				return true;
				
			}else {
				
				return false;
				
			}
			
		}else {
			
			return false;
			
		}
		
	}
	
}
