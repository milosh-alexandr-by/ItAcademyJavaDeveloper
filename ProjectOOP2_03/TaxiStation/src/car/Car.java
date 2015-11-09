package car;

public class Car {

	private String brand;			// марка автомобиля
	private String model;			// модель автомобиля
	private double fuelConsumption;	// расход топлива
	private int price;				// цена
	private int maxSpeed; 			// максимальная скорость
	
	public int numberLineSeats;  // количество рядов сидений
	public int maxNumberLineSeats;  // максимальное количество рядов сидений
	public int minNumberLineSeats;  // минимальное количество рядов сидений
	public int numberDoors;  // количество рядов дверей
	
	public boolean roof;	
	public void hasRoof(boolean hasRoof){
		if (hasRoof==true) {
			System.out.println("Машина с жёсткой крышей.");
		}
		else {
			System.out.println("Машина с раздвигающейся крышей.");
		}
	}
	
	
	
	public String getBrand() {
		return brand;
	}


	public void setBrand(String brand) {
		this.brand = brand;
	}


	public String getModel() {
		return model;
	}


	public void setModel(String model) {
		this.model = model;
	}


	public double getFuelConsumption() {
		return fuelConsumption;
	}


	public void setFuelConsumption(double fuelConsumption) {
		try {
			if (fuelConsumption<0) {
				throw new Exception("Расход топлива не может быть отрицательным.");
			}
			this.fuelConsumption = fuelConsumption;
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		try {
			if (fuelConsumption<0) {
				throw new Exception("Цена не может быть отрицательной.");
			}
			this.price = price;
		} catch (Exception e) {
			e.printStackTrace();
		}
	}


	public int getMaxSpeed() {
		return maxSpeed;
	}


	public void setMaxSpeed(int maxSpeed) {
		try {
			if (fuelConsumption<0) {
				throw new Exception("Максимальная скорость не может быть отрицательной.");
			}
			this.maxSpeed = maxSpeed;
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	// переопределение метода toString для объектов класса Car
	public String toString() {
		String str = getBrand() + ", " + getModel() + ", " +  getFuelConsumption() + ", " +  getPrice() + ", " + getMaxSpeed();
		return str;
	}
	
}
