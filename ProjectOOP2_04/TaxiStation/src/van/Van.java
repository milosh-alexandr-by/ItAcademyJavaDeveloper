package van;

import closeCar.CloseCar;


public class Van extends CloseCar {

	public final boolean trunk = false;
	
	public boolean leftSecondDoor;	  // ������� ������ ����� �����
	public void hasLeftSecondDoor(boolean hasLeftSecondDoor){
		if (hasLeftSecondDoor==true) {
			System.out.println("����� ���� ������ �����.");
		}
		else {
			System.out.println("����� ��� ������ �����.");
		}
	}
	


}
