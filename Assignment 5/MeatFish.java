
public class MeatFish extends Food{
	
	public MeatFish(String name, String unit, double price, 
					double stock, int caloriesPerUnit) {

		super(name,unit,price,stock,caloriesPerUnit);

	}
	
	public double getFat() {
		
		return 0.7;
		
	}
	
	public double getSugar() {
		
		return 0.1;
		
	} 
	
	public double getProtein() {
		
		return 0.2;
		
	}
	
	public String toString() {
		
		return "MeatFish: " + super.toString();
		
	}
}
