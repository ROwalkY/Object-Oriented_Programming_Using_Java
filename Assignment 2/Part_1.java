import java.util.Scanner;
import java.util.StringTokenizer;

public class Part_1 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Please enter a set of grades: ");

		String original_input = in.nextLine();
		
		StringTokenizer remove_semicolon = new StringTokenizer(original_input, ";() ");
		
		String number_text = new String();
		
		String fraction_convertor = new String();
		
		
		
		/*************************/
		
		//These variables are being used in calculation
		
		double sum = 0.0;
		
		double actual_number = 0.0;
		
		double numerator, denominator;
		
		double average = 0.0 ;
		
		int count_number = 0;
		/*************************/
		
		
		while(remove_semicolon.hasMoreTokens()) {
			
			number_text = remove_semicolon.nextToken();
			
			StringTokenizer slash_remove = new StringTokenizer(number_text,"/");
			
			if(slash_remove.countTokens()==2) {
				
				fraction_convertor = slash_remove.nextToken();
				
				numerator = Double.parseDouble(fraction_convertor);
				
				fraction_convertor = slash_remove.nextToken();
				
				denominator = Double.parseDouble(fraction_convertor);
				
				actual_number = ((numerator/denominator)*100);
				
			}else{
				
				actual_number = Double.parseDouble(number_text);
				
			}
			
			sum += actual_number;
			
			count_number++;
			
		}
		
		average = sum/count_number;
		
		System.out.println("The average is: "+String.format("%.1f", average));
		
		in.close();
	}
}
