package openCar;

public class Targa extends OpenCar{

	public final boolean safetyArc = true;

	public Targa(String brand, String model, double fuelConsumption, int price, int maxSpeed){
		this.setBrand(brand);
		this.setModel(model);
		this.setFuelConsumption(fuelConsumption);
		this.setPrice(price);
		this.setMaxSpeed(maxSpeed);
	}

}
