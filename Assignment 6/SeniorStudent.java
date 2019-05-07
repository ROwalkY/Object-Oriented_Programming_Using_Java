
public class SeniorStudent extends CanadianStudent{

	double pension;
	
	public SeniorStudent(String studentName, int numberOfCoursesTaken, double pension) {		
		super(studentName, numberOfCoursesTaken);		
		this.pension = pension;
	}
	
	public double computeFees() {
		return 50;
	}
	
	public boolean lessThan(Sortable object) {
		
		if(object == null) {
			
			return false;
			
		}else if(object instanceof ForeignStudent){
		
			return true;
			
		}else if(object instanceof CanadianStudentUnder65) {
			
			return true;
		
		}else if(object instanceof SeniorStudent) {
			
			SeniorStudent temp = (SeniorStudent)object;
			
			if(this.studentName.compareTo(temp.studentName) < 0) {
				
				return true;
				
			}else {
				
				return false;
				
			}
			
		}else {
			
			return false;
			
		}
	}
	
	public String toString() {
		
		return super.toString() + ", senior citizen who gets pension " + pension;
		
	}
	
}
