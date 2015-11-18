/*
 * Автомобили с закрытой крышей.
 */

package closeCar;
import car.Car;


public class CloseCar extends Car {

	// если roof = true то машина с крышей
	public final boolean roof = true;
	
	// определяет есть ли грузовой кузов, отделённый от салона
	public boolean truckBody;	  // грузовой кузов
	public void hasTruckbody(boolean hasTruckBody){
		if (hasTruckBody==true) {
			System.out.println("У машины есть грузовой кузов, отделённый от салона.");
		}
		else {
			System.out.println("У машины нет грузового кузова.");
		}
	}
	
	// есть ли багажник
	public boolean trunk;	  // багажник
	public void hastrunk(boolean hastrunk){
		if (hastrunk==true) {
			System.out.println("У машины есть багажник.");
		}
		else {
			System.out.println("Машина состоит из однообъёмного кузова.");
		}
	}
	
	// есть ли дверь, которая открывается по направляющим рельсам
	public boolean railDoor;	  // дверь по направляющей
	public void hasRailDoor(boolean hasRailDoor){
		if (hasRailDoor==true) {
			System.out.println("У машины задняя дверь открывается по направляющей.");
		}
		else {
			System.out.println("Задняя дверь открывается как обычная.");
		}
	}
	
	

}
