import java.util.Scanner;
import java.util.StringTokenizer;

public class Part_1 {

	public static void main(String[] args) {
		
		System.out.println("Please enter a sentence: ");
		
		Scanner input = new Scanner(System.in);
		
		String sentence = new String(input.nextLine());
		
		String longest_word = new String();
		
		String temporary_token = new String();
		
		StringTokenizer token = new StringTokenizer(sentence);
		
		int count_vowel = 0;
		
		if(token.hasMoreTokens()) {
			
			temporary_token = token.nextToken();
			
			longest_word = temporary_token;
			
		}else{
			
			System.out.println("There is no input");
			
			
		}
		
		
		while(token.hasMoreTokens()) {
			
			temporary_token = token.nextToken();
			
			longest_word = temporary_token.length() > longest_word.length() ? temporary_token : longest_word;
			
		}
		
		
		for(int i = 0; i < longest_word.length(); i++) {
			
			if(longest_word.charAt(i) == 'a' || longest_word.charAt(i) == 'e' ||longest_word.charAt(i) == 'i'
					|| longest_word.charAt(i) ==  'o' || longest_word.charAt(i) == 'u' )  {
				
				count_vowel++;
				
			}
			
		}
		
		System.out.println(longest_word+" has "+count_vowel+" vowel(s)");
		
		
		
		
		input.close();
	}

}
