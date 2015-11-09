package passengerCar;

public class SUV extends PassengerCar {

	public final boolean bodySUV = true;
	public final int minNumberLineSeats = 2;
	
	public SUV(String brand, String model, double fuelConsumption, int price, int maxSpeed){
		this.setBrand(brand);
		this.setModel(model);
		this.setFuelConsumption(fuelConsumption);
		this.setPrice(price);
		this.setMaxSpeed(maxSpeed);
	}





	
	
}
