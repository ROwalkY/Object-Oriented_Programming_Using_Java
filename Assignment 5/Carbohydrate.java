
public class Carbohydrate extends Food {

	public Carbohydrate(String name, String unit, double price,
				double stock, int caloriesPerUnit) {
		
		super(name,unit,price,stock,caloriesPerUnit);
		
	}
	
	public double getFat() {
		
		return 0.2;
		
	}
	
	public double getSugar() {
		
		return 0.6;
		
	} 
	
	public double getProtein() {
		
		return 0.2;
		
	}
	
	public String toString() {
		
		return "Carbohydrate: " + super.toString();
		
	}
}
