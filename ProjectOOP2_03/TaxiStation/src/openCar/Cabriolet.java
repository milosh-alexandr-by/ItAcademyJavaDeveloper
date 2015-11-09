package openCar;

public class Cabriolet extends OpenCar {

	public final boolean safetyArc = false;
	
	
	
	public Cabriolet(String brand, String model, double fuelConsumption, int price, int maxSpeed){
		this.setBrand(brand);
		this.setModel(model);
		this.setFuelConsumption(fuelConsumption);
		this.setPrice(price);
		this.setMaxSpeed(maxSpeed);
	}

}
