package van;

public class Minibus extends Van {

	public final boolean railDoor = true;
	public final boolean leftSecondDoor = false;
	public final int maxNumberLineSeats = 7;
	
	public Minibus(String brand, String model, double fuelConsumption, int price, int maxSpeed){
		this.setBrand(brand);
		this.setModel(model);
		this.setFuelConsumption(fuelConsumption);
		this.setPrice(price);
		this.setMaxSpeed(maxSpeed);
	}

}