package mpv;

import closeCar.CloseCar;


public abstract class MPV extends CloseCar {

	public final boolean truckBody = true;

	public boolean openTruckBody;	  // открытытый грузовой кузов
	public void hasOpenTruckBody(boolean hasOpenTruckBody){
		if (hasOpenTruckBody==true) {
			System.out.println("” машины открытый грузовой кузов.");
		}
		else {
			System.out.println("” закрытый грузовой кузов.");
		}
	}


}
