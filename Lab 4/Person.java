
public class Person {

	private Name personName;
	
	private Person spouse;
	
	public Person(String name) {
		
		personName = new Name(name);
		
	}
	
	public void setSpouse(Person spouse) {
		
		this.spouse = spouse;
		
	}
	
	
	public Name getPersonName() {
		
		return new Name(personName);
		
	}
	
	public Name getSpouseName() {
		
		return new Name(spouse.personName);
		
	}
	
	public double getFamilyIncome() {
		
		double sum;
		
		if(this instanceof NewWorker) {
			
			NewWorker current = (NewWorker)this;
			
			sum = current.getSalary();
			
			if(this.spouse instanceof NewWorker) {
				
				NewWorker currentSpouse = (NewWorker)this.spouse;
				
				sum += currentSpouse.getSalary();
				
			}
			
		}else if(this.spouse instanceof NewWorker){
			
			NewWorker Spouse = (NewWorker)this.spouse;
			
			sum = Spouse.getSalary();
			
		}else {
			
			sum = 0;
			
		}
		
		return sum;
		
	}
	public String toString() {
		
		String result = new String();
		
		result = "Name is "+ personName.toString();
		
		if(spouse != null) {
			
			result += "\nMarried to "+ spouse.personName.toString();
			
		}
		
		return result;
	}
}
