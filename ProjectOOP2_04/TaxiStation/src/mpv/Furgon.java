package mpv;

public class Furgon extends MPV {

	public final boolean openTruckBody = false;

	public Furgon(String brand, String model, double fuelConsumption, int price, int maxSpeed){
		this.setBrand(brand);
		this.setModel(model);
		this.setFuelConsumption(fuelConsumption);
		this.setPrice(price);
		this.setMaxSpeed(maxSpeed);
	}
	
}
