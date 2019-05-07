import java.util.Scanner;
import java.util.StringTokenizer;

public class Part_2 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		String firstname = new String();
		
		String lastname = new String();
		
		String regex_pattern = "([Mm][rs])?\\s*([a-zA-Z])+\\s+[a-zA-Z]?\\.?\\s*([a-zA-Z])+";		
		//regex pattern to check if the input is valid
		
		System.out.println("Please enter a name: ");		
				
		String get_input = in.nextLine();		
		//get the initial input
		
		StringTokenizer dot_remove = new StringTokenizer(get_input, ".");
		// use to remove the "." that in the input later
		
		String input = new String();	
		//use to store the string after being tokenized
		
		while(dot_remove.hasMoreTokens()) {	
			//process to get rid of the dot "." in the input
			input += dot_remove.nextToken();
			
		}
		
		if(input.matches(regex_pattern)) {
			//check if the input match the regex pattern
			
			String Modified_text = input.replaceAll("[Mm][rs]", "");
			//replace salutation first from the input and store in Modified_text
			
			String Final_output = Modified_text.replaceAll( "\\b\\w\\b" , "");
			//remove the middle name character from the string Modified_text
			
			StringTokenizer token = new StringTokenizer(Final_output);
			//use to remove the space characters in the Final_output
			
			firstname = token.nextToken();
			//get the first string piece and store into firstname
			
			lastname = token.nextToken();
			//get the next part and store in lastname
			
			System.out.println(firstname + " " + lastname);
			
		}else{
			//if not match, print Invalid Name to the screen
			System.out.println("Invalid Name");
			
		}
		
		
		in.close();		//close the scanner
	}

}
