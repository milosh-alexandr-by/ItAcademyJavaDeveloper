/*
 * Класс для шаблона, по которому будут создаватсья экземпляры класса (автомобили).
 * Также переопределён метод toString, для вывода автомобиля и его зарактеристик на экран
 */

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
	
	// булевская переменная roof, которая разделяет на машины с крышей и без крыши
	public boolean roof;	// крыша
	public void hasRoof(boolean hasRoof){
		if (hasRoof==true) {
			System.out.println(SelectLanguage.rb.getString("solidRoofCar"));
		}
		else {
			System.out.println(SelectLanguage.rb.getString("moveRoofCar"));
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
				throw new Exception(SelectLanguage.rb.getString("fuelConsNotNeg"));
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
				throw new Exception(SelectLanguage.rb.getString("priceNotNeg"));
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
				throw new Exception(SelectLanguage.rb.getString("maxSpeedNotNeg"));
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
