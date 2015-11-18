/*
 * Таксопарк, который содержит автомобили (7 штук).
 * Выводится на экран стоимость таксопарка.
 * Таксопарк сортируется по расходу топлива и по цене автомобиля.
 * Находит автомобиль, который соответсвует заданному диапазону параметров скорости.
 */
import java.util.*;


public class TaxiStation {

	public static void main(String[] args) {
		
// Список (коллекция ArrayList)	автомобилей таксопарка.	
		ArrayList<TaxiCars> taxiCarsList = new ArrayList<TaxiCars>();
		taxiCarsList.add(new TaxiCars("VW", "Passat B6", 1.8, 8.1, 2008, 11000, 150));
		taxiCarsList.add(new TaxiCars("Toyota", "Camry", 2.5, 9.7, 2010, 13700, 175));
		taxiCarsList.add(new TaxiCars("Hyundai", "Sonata", 2.0, 8.0, 2014, 17700, 180));
		taxiCarsList.add(new TaxiCars("Kia", "Rio", 1.6, 7.5, 2015, 1000, 155));
		taxiCarsList.add(new TaxiCars("Ford", "Mondeo", 1.6, 8.6, 2010, 9400, 163));
		taxiCarsList.add(new TaxiCars("Opel", "Astra", 1.6, 8.1, 2010, 8300, 144));
		taxiCarsList.add(new TaxiCars("Mazda", "6", 2.0, 8.2, 2013, 17600, 151));
		
// 	Вывести на экран стоимость таксопарка.	
		TaxiCars.costOfTaxiStation(taxiCarsList);
		
// Вывести на экран таксопарк с помощью for each.		
		for (TaxiCars ob : taxiCarsList) {
			System.out.println(ob);
		}
	
// 	Сортировка по расходу топлива.	
		TaxiCars.SortedByFuelConsumption(taxiCarsList);
		TaxiCars.printTaxiStation(taxiCarsList);
			
// Сортировка по цене.		
		Collections.sort(taxiCarsList,	new SortedByPrice() );	
		 TaxiCars.printTaxiStation(taxiCarsList);
		 
// 	Находит автомобиль, который соответсвует заданному диапазону параметров скорости.	 
		 TaxiCars.speedDiapazon(taxiCarsList);


		
	}

}