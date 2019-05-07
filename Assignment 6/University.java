
public class University{

	private Student studentMembers[];
	
	private int maximumNumberOfStudents;
	
	private int totalMembers = 0;
	
	public University(int maximumNumberOfStudents) {
		
		this.maximumNumberOfStudents = maximumNumberOfStudents;
		
		studentMembers = new Student[maximumNumberOfStudents];
		
	}
	
	public boolean insertStudent(Student member) {
		
		if(totalMembers == maximumNumberOfStudents) {
			
			return false;
			
		}else {
			
			studentMembers[totalMembers] = member;
			
			totalMembers++;
			
			return true;
			
		}
		
	}
	
	public int numberOfStudents(String country) {
		
		int count = 0;
		
		for(int i = 0; i < totalMembers; i++) {
			
			if(studentMembers[i].findCountry().compareTo(country) == 0) {
				
				count++;
				
			}
			
		}
		
		return count;
		
	}
	
	public void sortStudents() {
		
		Sort.sortAnything(studentMembers, totalMembers);
		
	}
	
	public String toString() {
		
		String result = "Number of students in university = " + totalMembers +"\n";
		
		for(int i = 0; i < totalMembers; i++) {
			
			result += studentMembers[i].toString() + "\n";
			
		}
		
		return result;
	}
}
