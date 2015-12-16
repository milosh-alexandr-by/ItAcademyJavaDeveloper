package van;

import car.SelectLanguage;
import closeCar.CloseCar;

public class Van extends CloseCar {

	public final boolean trunk = false;
	
	public boolean leftSecondDoor;	  // наличие второй двери слева
	public void hasLeftSecondDoor(boolean hasLeftSecondDoor){
		if (hasLeftSecondDoor==true) {
			System.out.println(SelectLanguage.rb.getString("leftDoor"));
		}
		else {
			System.out.println(SelectLanguage.rb.getString("leftDoorNo"));
		}
	}
	
}
