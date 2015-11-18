package passengerCar;

import closeCar.CloseCar;

public class PassengerCar extends CloseCar {
	
	public final boolean trunk = true;   // есть багажник
	public final boolean railDoor = false;  // нет двери на рельсах
	
	// определяем как открывается багажник
	String typeOfTrunk;
	public void typeOfTrunk(String typeOfTrunk) {
		switch (typeOfTrunk) {
		case "sedan": System.out.println("Открывается только крышка багажника.");
		case "universal": System.out.println("Открывается багажник со стеклом.");
		case "hatchback": System.out.println("Открывается укороченный багажник со стеклом.");
		case "bigsuv": System.out.println("Дверь багажника открывается в сторону, а не вверх.");
		}
	}
	
	// если bodySUV=true, то это внедорожник, которому соответсвует увеличенный клиренс и увеличенный объём салона
	public boolean bodySUV;	  // кузов внедоржника
	public void hasBodySUV(boolean hasBodySUV){
		if (hasBodySUV==true) {
			System.out.println("Увеличенный клиренс. Увеличенный объём салона.");
		}
		else {
			System.out.println("Легковая машина.");
		}
	}
	
	// если increasedRearSeat=true то место для задних пассажиров увеличено, например для лимузина
	public boolean increasedRearSeat;	  // увеличенное место для задних пассажиров
	public void hasIncreasedRearSeat(boolean hasIncreasedRearSeat){
		if (hasIncreasedRearSeat==true) {
			System.out.println("Место для задних пассажиров увеличено. Можно расположить диваны вдоль салона. ");
		}

	}

}
