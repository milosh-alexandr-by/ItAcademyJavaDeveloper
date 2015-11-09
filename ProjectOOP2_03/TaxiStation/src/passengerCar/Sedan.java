package passengerCar;

public class Sedan extends PassengerCar {

	public final int minNumberLineSeats = 2;
	
	public final String typeOfTrunk = "sedan";
	
	public Sedan(String brand, String model, double fuelConsumption, int price, int maxSpeed){
		this.setBrand(brand);
		this.setModel(model);
		this.setFuelConsumption(fuelConsumption);
		this.setPrice(price);
		this.setMaxSpeed(maxSpeed);
	}

}

