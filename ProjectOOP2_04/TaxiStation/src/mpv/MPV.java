package mpv;

import closeCar.CloseCar;


public abstract class MPV extends CloseCar {

	public final boolean truckBody = true;

	public boolean openTruckBody;	  // ���������� �������� �����
	public void hasOpenTruckBody(boolean hasOpenTruckBody){
		if (hasOpenTruckBody==true) {
			System.out.println("� ������ �������� �������� �����.");
		}
		else {
			System.out.println("� �������� �������� �����.");
		}
	}


}
