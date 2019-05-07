import java.util.StringTokenizer;

public class Name {
	
	private String firstName = new String();
	
	private String middleName = new String();
	
	private String lastName = new String();
	
	public Name(String input) {
		
		StringTokenizer token = new StringTokenizer(input);
		
		int count_token = token.countTokens();
		
		if(count_token == 2) {
			
			firstName = token.nextToken();
			
			lastName = token.nextToken();
			
		}else if(count_token == 3) {
			
			firstName = token.nextToken();
			
			middleName = token.nextToken();
			
			lastName = token.nextToken();
		}else {
			
			System.out.println("The input name is invalid");
			
		}
		
	}
	
	
	public Name(Name copy) {
		
		firstName = new String(copy.firstName);
		
		middleName = new String(copy.middleName);
		
		lastName = new String(copy.lastName);
		
	}
	
	public void setName(String firstname,String middlename, String lastname) {
		
		firstName = firstname;
		
		middleName = middlename;
		
		lastName = lastname;
		
	}
	
	public String toString() {
		
		String result = new String();
		
		if(middleName.isEmpty()) {
			
			result = lastName + ", "+ firstName;
			
		}else {
			
			result = lastName + ", "+ firstName + " " + middleName.charAt(0) + ".";
			
		}
		
		return result;
	}

}


