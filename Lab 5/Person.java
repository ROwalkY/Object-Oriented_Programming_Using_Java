public abstract class Person{
	private Name personName;
	private Person spouse;

	public Person(String fullName){
		personName = new Name(fullName);
	}

	public void setSpouse(Person spouse){
		this.spouse = spouse;		
	}
	
	public Name getPersonName(){
		return new Name(personName);
	}
	
	public Name getSpouseName(){
		return new Name(spouse.personName);
	}
	
	public abstract double getSalary();
	
	public double getFamilyIncome(){
		double incomePerson, incomeSpouse, familyIncome;

		if(this instanceof NewWorker){
			incomePerson = this.getSalary();
		}
		else{
			incomePerson = 0.0;
		}
		if(spouse instanceof NewWorker){
			incomeSpouse = spouse.getSalary();
		}
		else{
			incomeSpouse = 0.0;
		}
		familyIncome = incomePerson + incomeSpouse;

		return familyIncome;
	}
	
	public String toString(){
		if(spouse != null){
			return "Name is " + getPersonName() + "\nMarried to " + getSpouseName();
		}
		else
			return "Name is " + getPersonName();
	}
}