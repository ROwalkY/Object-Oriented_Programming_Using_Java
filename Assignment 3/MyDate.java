import java.util.StringTokenizer;


public class MyDate {
	
	private int day;
	
	private int month;
	
	private int year;
	
	public MyDate(String Date) {
		
		StringTokenizer token = new StringTokenizer(Date, "/");
		
		day = Integer.parseInt(token.nextToken());
		
		month = Integer.parseInt(token.nextToken());
		
		year = Integer.parseInt(token.nextToken());
		
		
	}
	
	public MyDate() {
		
		day = 0;
		
		month = 0;
		
		year = 0;
		
	}
	
	public MyDate(MyDate copy) {
		
		day = new Integer(copy.day);
		
		month = new Integer(copy.month);
		
		year = new Integer(copy.year);
		
	}
	
	public String toString() {
		
		String monthname = new String();
		
		switch(month) {		//transfer the month to word expression
		
			case 1:
				
				monthname = "January";
				
				break;
				
			case 2:
				
				monthname = "Feburary";
				
				break;
			
			case 3:
				
				monthname = "March";
				
				break;
				
			case 4:
				
				monthname = "April";
				
				break;
				
			case 5:
				
				monthname = "May";
				
				break;
				
			case 6:
				
				monthname = "June";
				
				break;	
				
			case 7:
				
				monthname = "July";
				
				break;
				
			case 8:
				
				monthname = "August";
				
				break;
				
			case 9:
				
				monthname = "September";
				
				break;
				
			case 10:
				
				monthname = "October";
				
				break;
				
			case 11:
				
				monthname = "November";
				
				break;
			
			case 12:
				
				monthname = "December";
				
				break;
		}
		
		int year_TwoDigit = (year % 10) + ((year/10)%10)*10;	//get the last two digit of the year
		
		String result = String.format("%2d", day) + " " + monthname +", "+String.format("%02d", year_TwoDigit);
		
		return result;
	}
	
	
	
	//lessThan: accept  a MyDate object and compare the argument to the current object
	//Input:	a MyDate object
	//Output:	return true if the current date is less than given date, else return false
	public boolean lessThan(MyDate compare) {
		
		if(year < compare.year) {
			
			return true;
			
		}else if( (year == compare.year) && (month < compare.month) ) {
			
			return true;
			
		}else if((year == compare.year) && (month == compare.month) && (day < compare.day)) {
			
			return true;
			
		}else {
			
			return false;
			
		}
		
	}
	
	//equals: 	accept another MyDate object and compare the argument to the current object
	//INPUT:	a MyDate object
	//OUTPUT:	return true if all the values are the same else return false
	public boolean equals(MyDate compare) {
		
		if((year == compare.year) && (month == compare.month) && (day == compare.day)) {
			
			return true;
			
		}else {
			
			return false;
			
		}
		
	}

}
