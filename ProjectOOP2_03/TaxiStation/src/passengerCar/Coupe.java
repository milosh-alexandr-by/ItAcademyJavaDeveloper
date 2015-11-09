package passengerCar;


public class Coupe extends PassengerCar {

	public final int numberLineSeats = 1;
	public final int numberDoors = 1;

	public Coupe(String brand, String model, double fuelConsumption, int price, int maxSpeed){
		this.setBrand(brand);
		this.setModel(model);
		this.setFuelConsumption(fuelConsumption);
		this.setPrice(price);
		this.setMaxSpeed(maxSpeed);
	}
}
