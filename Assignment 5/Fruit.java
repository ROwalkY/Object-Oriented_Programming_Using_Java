
public class Fruit extends Food {

	public Fruit(String name, String unit, double price, 
				 double stock, int caloriesPerUnit) {
	
		super(name,unit,price,stock,caloriesPerUnit);
	
	}
	
	public double getFat() {
		
		return 0;
		
	}
	
	public double getSugar() {
		
		return 1;
		
	}
	
	public double getProtein() {
		
		return 0;
		
	}
	
	public String toString() {
		
		return "Fruit: " + super.toString();
		
	}
}
