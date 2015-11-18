/*
 * Класс, который является шаблоном для создания конкретных автомобилй (пассажирских) нашего таксопарка.
 * Содержит метод для вычисления стоимости таксопарка и сортировки по расходу топилва.
 * Содержит метод, который выводит на экран таксопарк.
 * Содержит метод, который находит автомобиль, который соответсвует заданному диапазону параметров скорости.
 */
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;

public class TaxiCars extends PassengerCar {
	
	private String brand;			// марка автомобиля
	private String model;			// модель автомобиля
	private double volumeOfEngine;	// объём двигателя
	private double fuelConsumption;	// расход топлива
	private int productionYear;		// год выпуска
	private int price;				// цена
	private int maxSpeed; 			// максимальная скорость
	
	
	public TaxiCars(String brand, String model, double volumeOfEngine, double fuelConsumption, int productionYear, int price, int maxSpeed) {
		this.brand = brand;
		this.model = model;
		this.volumeOfEngine = volumeOfEngine;
		this.fuelConsumption = fuelConsumption;
		this.productionYear = productionYear;
		this.price = price;
		this.maxSpeed = maxSpeed;
	}

// переопределение метода toString для объектов класса TaxiCars	
	public String toString() {
		String str = getBrand() + ", " + getModel() + ", " + getVolumeOfEngine() + ", " +  getFuelConsumption() + ", " + getProductionYear() + ", " +  getPrice() + ", " + getMaxSpeed();
		return str;
	}
	
// метод для сортровоки по расходу топлива
	public static void SortedByFuelConsumption(ArrayList<TaxiCars> arr) {
		Collections.sort(arr, 				
				new Comparator<TaxiCars>() {			
				@Override
				public int compare(TaxiCars obj1, TaxiCars obj2) {
					double fc1 = obj1.getFuelConsumption();
					double fc2 = obj2.getFuelConsumption();
					if (fc1>fc2) {
						return 1;
					}
					else if (fc1<fc2) {
						return -1;
					}
					else {
						return 0;
					}
				}
				}	
		);	
	}
	
// метод, который подсичтывает стоимость таксопарка
	public static void costOfTaxiStation(Collection<TaxiCars> arr) {
		int priceOfTaxiStation = 0;
		Iterator<TaxiCars> itr = arr.iterator();
		while (itr.hasNext()) {
			priceOfTaxiStation += itr.next().getPrice();
		}
		System.out.println("Стоимость автопарка: " + priceOfTaxiStation + " долларов.\n");
	}
	
// метод, который выводит на экран таксопарк
	public static void printTaxiStation(ArrayList<TaxiCars> arr){
		System.out.println();
	     Iterator<TaxiCars> itr = arr.iterator();
	      while(itr.hasNext()) {
	         Object element = itr.next();
	         System.out.println(element);
	      }
	}
	
// метод, который находит автомобиль, который соответсвует заданному диапазону параметров скорости
	public static void speedDiapazon(Collection<TaxiCars> arr) {
		System.out.println();
		Scanner sc = new Scanner(System.in);
		System.out.print("Введите нижнюю границу диапазона: ");
		int startDiapazon = sc.nextInt();
		System.out.print("Введите нижнюю границу диапазона: ");
		int endDiapazon = sc.nextInt();
		for (TaxiCars tc : arr) {
			if (tc.getMaxSpeed()>=startDiapazon & tc.getMaxSpeed()<=endDiapazon) {
				 System.out.println(tc);
			 }			 
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

	public double getVolumeOfEngine() {
		return volumeOfEngine;
	}

	public void setVolumeOfEngine(double volumeOfEngine) {
		this.volumeOfEngine = volumeOfEngine;
	}

	public double getFuelConsumption() {
		return fuelConsumption;
	}

	public void setFuelConsumption(double fuelConsumption) {
		this.fuelConsumption = fuelConsumption;
	}

	public int getProductionYear() {
		return productionYear;
	}

	public void setProductionYear(int productionYear) {
		this.productionYear = productionYear;
	}
	
	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

}