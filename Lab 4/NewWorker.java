
public class NewWorker extends Person{

	private int workerNumber;
	
	private static int howManyWorkers = 0;
	
	private MyDate dateJoiningCompany;
	
	private double salary;
	
	private NewWorker supervisor;
	
	public NewWorker(String name, String date, double salary) {
		
		super(name);
		
		dateJoiningCompany = new MyDate(date);
		
		this.salary = salary;
		
		workerNumber = howManyWorkers + 1;
		
		howManyWorkers++;
	}
	
	public NewWorker(String name, String date) {
		
		super(name);
		
		dateJoiningCompany = new MyDate(date);
		
		salary = 0;
		
		workerNumber = howManyWorkers + 1;
		
		howManyWorkers++;
		
	}

	public void setSalary(double salary) {
		
		this.salary = salary;
		
	}
	
	public double getSalary() {
		
		return salary;
		
	}
	
	public void setSupervisor(NewWorker supervisor) {
		
		this.supervisor = supervisor;
		
	}
	
	public String getSupervisor() {
		
		return supervisor.getPersonName().toString();
		
	}
	
	public String toString() {
		
		String result = new String();
		
		result = "Worker Number " + workerNumber + "\nWorker Name "+ getPersonName().toString();
		
		result += "\nDate Joined: " + dateJoiningCompany.toString();
		
		result += "\nSupervisor: ";
		
		if(supervisor != null) {
			
			result += this.getSupervisor() + "\n";
			
		}else {
			
			result += "No Supervisor\n";
			
		}
		
		result += "Salary: $"+ salary +"\n";
		
		return result;
		
	}
	
	public static int getHowManyWorkers() {
		
		return howManyWorkers;
		
	}
}
