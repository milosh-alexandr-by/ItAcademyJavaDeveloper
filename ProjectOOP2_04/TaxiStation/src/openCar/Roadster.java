package openCar;

public class Roadster extends OpenCar{

	public final boolean safetyArc = false;
	
	public final int numberLineSeats = 1;
	
	public Roadster(String brand, String model, double fuelConsumption, int price, int maxSpeed){
		this.setBrand(brand);
		this.setModel(model);
		this.setFuelConsumption(fuelConsumption);
		this.setPrice(price);
		this.setMaxSpeed(maxSpeed);
	}

}
