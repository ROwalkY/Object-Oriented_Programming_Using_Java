
public class Household {
	
	Person householdMembers[];
	
	private int totalMembers = 0;
	
	private int maxMembers;
	
	public Household() {
		
		householdMembers = new Person[10];
		
		maxMembers = 10;
		
	}
	
	public Household(int maxMembers) {
		
		householdMembers = new Person[maxMembers];
		
		this.maxMembers = maxMembers;
		
	}
	
	public boolean insertNewHouseholdMember(Person member) {
		
		if(totalMembers == maxMembers) {
			
			return false;
			
		}else {
			
			householdMembers[totalMembers] = member;
			
			totalMembers++;
			
			return true;
			
		}
	}
	
	public String toString() {
		
		String result = new String();
		
		for(Person s: householdMembers) {
			
			result += s.toString();
			
		}
		return result;
	}
}
