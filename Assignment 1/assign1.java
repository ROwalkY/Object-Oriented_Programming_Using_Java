
public class assign1 {

	public static void main(String[] args) {
		
		int T = 1, O = 0, G, D; //initialize the values

		int TOO_SUM;	//sum of the three numbers TOO
		
		int GOOD;		//indicate the sum of 4 TOO adding together
		
		boolean find = true;
		
			
		for(T = 1; T < 10 && find; T++) {
				
			TOO_SUM = 0;//initialize TOO_SUM
				
			for(O = 0; O < 10 && find; O++) {
					
				TOO_SUM = T*10*10 + O*10 + O;
					
				GOOD = 4 * TOO_SUM;
					
				D = GOOD % 10;
					
				G = GOOD /1000;
					
				if(D == (4*O)%10 && (GOOD/10)%10 == (GOOD/100)%10 && G > 0 && T > O && (GOOD/10)%10 == O) {
				//check the conditions
				/*
				 * D is equal to the (O*4)%10
				 * Os are the same in GOOD
				 * G is bigger than 0
				 * T is bigger than 0
				 * The Os in GOOD are the same as Os in TOO
				 * */
					find = false;
						
					System.out.println("T = ["+T+"], O = ["+O+"], G = ["+G+"], D = ["+D+"] ");
						
				}
					
					
			}
				
		}
				
	}
		
		
		
}


