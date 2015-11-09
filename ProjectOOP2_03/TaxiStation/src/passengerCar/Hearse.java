package passengerCar;

public class Hearse extends PassengerCar  {

	public final int numberLineSeats = 1;
	
	public Hearse(String brand, String model, double fuelConsumption, int price, int maxSpeed){
		this.setBrand(brand);
		this.setModel(model);
		this.setFuelConsumption(fuelConsumption);
		this.setPrice(price);
		this.setMaxSpeed(maxSpeed);
	}



}

