package van;

import closeCar.CloseCar;


public class Van extends CloseCar {

	public final boolean trunk = false;
	
	public boolean leftSecondDoor;	  // наличие второй двери слева
	public void hasLeftSecondDoor(boolean hasLeftSecondDoor){
		if (hasLeftSecondDoor==true) {
			System.out.println("Слева есть вторая дверь.");
		}
		else {
			System.out.println("Слева нет второй двери.");
		}
	}
	


}
