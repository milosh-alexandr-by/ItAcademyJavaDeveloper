package passengerCar;

public class Limousine extends PassengerCar {

	public final boolean increasedRearSeat = true;
	
	public Limousine(String brand, String model, double fuelConsumption, int price, int maxSpeed){
		this.setBrand(brand);
		this.setModel(model);
		this.setFuelConsumption(fuelConsumption);
		this.setPrice(price);
		this.setMaxSpeed(maxSpeed);
	}

}
