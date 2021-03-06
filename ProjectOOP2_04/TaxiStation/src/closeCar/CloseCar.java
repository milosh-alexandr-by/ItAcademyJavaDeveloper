/*
 * Автомобили с закрытой крышей.
 */

package closeCar;
import car.Car;
import car.SelectLanguage;


public class CloseCar extends Car {

	// если roof = true то машина с крышей
	public final boolean roof = true;
	
	// определяет есть ли грузовой кузов, отделённый от салона
	public boolean truckBody;	  // грузовой кузов
	public void hasTruckbody(boolean hasTruckBody){
		if (hasTruckBody==true) {
			System.out.println(SelectLanguage.rb.getString("cargoBodySeparatedPassenger"));
		}
		else {
			System.out.println(SelectLanguage.rb.getString("carNoCargoBody"));
		}
	}
	
	// есть ли багажник
	public boolean trunk;	  // багажник
	public void hastrunk(boolean hastrunk){
		if (hastrunk==true) {
			System.out.println(SelectLanguage.rb.getString("carHasTrunk"));
		}
		else {
			System.out.println(SelectLanguage.rb.getString("carBodyVan"));
		}
	}
	
	// есть ли дверь, которая открывается по направляющим рельсам
	public boolean railDoor;	  // дверь по направляющей
	public void hasRailDoor(boolean hasRailDoor){
		if (hasRailDoor==true) {
			System.out.println(SelectLanguage.rb.getString("doorOpenGuide"));
		}
		else {
			System.out.println(SelectLanguage.rb.getString("doorOpenUsual"));
		}
	}
	
	

}
