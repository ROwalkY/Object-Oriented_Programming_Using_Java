
public abstract class Food {
	
	private String name;
	
	private String unit;
	
	private double price;
	
	private double stock;
	
	private double caloriesPerUnit;
	
	public Food(String name, String unit, double price,
				double stock, int caloriesPerUnit) {
		
		this.name = name;		
		this.unit = unit;		
		this.price = price;	
		this.stock = stock;		
		this.caloriesPerUnit = caloriesPerUnit;
		
	}
	
	public abstract double getFat();
	
	public abstract double getSugar();
	
	public abstract double getProtein();
	
	public double getPrice() {
		
		return price;
		
	}
	
	public double getCaloriesPerUnit() {
		
		return caloriesPerUnit;
		
	}
	
	public String getName() {
		
		return name;
		
	}
	
	public boolean decreaseStock(double amount) {
		
		if(amount > stock) {
			
			return false;
			
		}else {
			
			stock = stock - amount;
			
			return true;
		}
		
	}
	
	public String toString() {
		
		String result = name + ", " + "$" + price + "/" + unit +
						", " + stock + " " + unit + " in stock";
		
		return result;
		
	}
	
}
