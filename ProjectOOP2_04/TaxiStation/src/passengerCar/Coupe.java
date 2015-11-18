package passengerCar;


public class Coupe extends PassengerCar {

	// один ряд сидений
	public final int numberLineSeats = 1;
	// один ряд дверей
	public final int numberDoors = 1;

	public Coupe(String brand, String model, double fuelConsumption, int price, int maxSpeed){
		this.setBrand(brand);
		this.setModel(model);
		this.setFuelConsumption(fuelConsumption);
		this.setPrice(price);
		this.setMaxSpeed(maxSpeed);
	}
}
