package van;

public class Minivan extends Van  {

	public final boolean leftSecondDoor = true;
	public int numberLineSeats = 3;  // количество рядов сидений
	public final int maxNumberLineSeats = 4;
	
	public Minivan(String brand, String model, double fuelConsumption, int price, int maxSpeed){
		this.setBrand(brand);
		this.setModel(model);
		this.setFuelConsumption(fuelConsumption);
		this.setPrice(price);
		this.setMaxSpeed(maxSpeed);
	}

	
}

