
public class Sedan extends Car {
	
	String brand;
	
	public Sedan(String brand) {
		this.brand = brand;
	}
	
	
	public void move() {
		System.out.print(brand);super.move();
		
	}

}