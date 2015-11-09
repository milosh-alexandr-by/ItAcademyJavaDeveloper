package passengerCar;

public class Hatchback extends PassengerCar {

	public final String typeOfTrunk = "hatchback";
	public final int minNumberLineSeats = 2;
	
	public Hatchback(String brand, String model, double fuelConsumption, int price, int maxSpeed){
		this.setBrand(brand);
		this.setModel(model);
		this.setFuelConsumption(fuelConsumption);
		this.setPrice(price);
		this.setMaxSpeed(maxSpeed);
	}

		
}
