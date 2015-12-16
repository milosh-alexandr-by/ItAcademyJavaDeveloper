package passengerCar;

public class Universal extends PassengerCar {
	
	public final String typeOfTrunk = "universal";
	public final int minNumberLineSeats = 2;

	public Universal(String brand, String model, double fuelConsumption, int price, int maxSpeed){
		this.setBrand(brand);
		this.setModel(model);
		this.setFuelConsumption(fuelConsumption);
		this.setPrice(price);
		this.setMaxSpeed(maxSpeed);
	}

}
