package passengerCar;

import car.SelectLanguage;
import closeCar.CloseCar;

public class PassengerCar extends CloseCar {
	
	public final boolean trunk = true;   // есть багажник
	public final boolean railDoor = false;  // нет двери на рельсах
	
	// определяем как открывается багажник
	String typeOfTrunk;
	public void typeOfTrunk(String typeOfTrunk) {
		switch (typeOfTrunk) {
		case "sedan": System.out.println(SelectLanguage.rb.getString("opensTheBootLidOnly"));
		case "universal": System.out.println(SelectLanguage.rb.getString("opensRackWithGlass"));
		case "hatchback": System.out.println(SelectLanguage.rb.getString("opensShortTrunkWithGlass"));
		case "bigsuv": System.out.println(SelectLanguage.rb.getString("tailgateOpensToSideNotUp"));
		}
	}
	
	// если bodySUV=true, то это внедорожник, которому соответсвует увеличенный клиренс и увеличенный объём салона
	public boolean bodySUV;	  // кузов внедоржника
	public void hasBodySUV(boolean hasBodySUV){
		if (hasBodySUV==true) {
			System.out.println(SelectLanguage.rb.getString("increasedcabin"));
		}
		else {
			System.out.println(SelectLanguage.rb.getString("passengerCar"));
		}
	}
	
	// если increasedRearSeat=true то место для задних пассажиров увеличено, например для лимузина
	public boolean increasedRearSeat;	  // увеличенное место для задних пассажиров
	public void hasIncreasedRearSeat(boolean hasIncreasedRearSeat){
		if (hasIncreasedRearSeat==true) {
			System.out.println(SelectLanguage.rb.getString("spaceRearPassIncreased"));
		}

	}

}
