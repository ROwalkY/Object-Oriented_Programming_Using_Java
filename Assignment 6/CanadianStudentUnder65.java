
public class CanadianStudentUnder65 extends CanadianStudent{

	public CanadianStudentUnder65(String studentName, int numberOfCoursesTaken) {
		super(studentName, numberOfCoursesTaken);
	}
	
	public CanadianStudentUnder65(String studentName) {	
		super(studentName, 5);	
	}
	
	public double computeFees() {
		
		double fees;
		
		if(numberOfCoursesTaken >= 4) {
			
			fees = 800;
			
		}else {
			
			fees = numberOfCoursesTaken * 200;
			
		}
		
		return fees;
	}
	
	public boolean lessThan(Sortable object) {
		
		if(object == null) {
			
			return false;
			
		}else if(object instanceof SeniorStudent){
			
			return false;
			
		}else if(object instanceof ForeignStudent) {
			
			return false;
			
		}else if(object instanceof CanadianStudentUnder65){
			
			CanadianStudentUnder65 temp = (CanadianStudentUnder65)object;
			
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
