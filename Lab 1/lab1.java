
import java.util.Scanner;

public class lab1{
	
	public static void main(String args[]){
		
		Scanner get_input = new Scanner(System.in);
		
		System.out.println("Please input a integer: ");
		
		int prime_num = get_input.nextInt();	//get prime number input
		
		prime_num++;
		
		get_input.close();
		
		int find = 0;				
		//to indicate whether the prime number being found or not
		
		while(find == 0) {
			
			int count_divisor = 0;				//use to count how many divisors
			
			for(int i = prime_num; i > 0 ; i--) {
			//count from prime number to 0
				
				if( (prime_num % i) == 0) {
				//if the reminder is 0, count_divisor + 1
				
					count_divisor++;
					
				}
			
			}
			
			
			//check if it only has 2 divisor
			if(count_divisor == 2) {
				
				find = 1;
				
				System.out.println("The next prime number is: "+ prime_num);
				
			}else{
				
				prime_num++;
				
			}
			
		}
		
		
	}
	
}