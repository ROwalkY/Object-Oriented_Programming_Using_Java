import java.util.Scanner;
import java.util.StringTokenizer;


public class Part_2 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter a date in DD/MM/YY or DD-MM-YY: ");
		
		String original_input = in.nextLine();
		
		StringTokenizer format_romove = new StringTokenizer(original_input,"/-");
		
		String regex_pattern = "[0-3][0-9][/-][01][0-9][/-][0-9][0-9]";
		
		int date, month;
		
		String current_word = new String();
		
		if(original_input.matches(regex_pattern)) {
			
			current_word = format_romove.nextToken();
			
			date = Integer.parseInt(current_word);
			
			current_word = format_romove.nextToken();
			
			month = Integer.parseInt(current_word);
			
			if( (date < 32) && (month < 13) && (date > 0) &&(month > 0)) {
				
				System.out.println("That is a valid date");
				
			}else {
				
				System.out.println("That is an invalid date");
				
			}
			
		} else {
			
			System.out.println("That is an invalid date");
			
		}
		
		
		in.close();
		
	}

}
