package passengerCar;

import closeCar.CloseCar;

public class PassengerCar extends CloseCar {
	
	public final boolean trunk = true;   // ���� ��������
	public final boolean railDoor = false;  // ��� ����� �� �������
	
	// ���������� ��� ����������� ��������
	String typeOfTrunk;
	public void typeOfTrunk(String typeOfTrunk) {
		switch (typeOfTrunk) {
		case "sedan": System.out.println("����������� ������ ������ ���������.");
		case "universal": System.out.println("����������� �������� �� �������.");
		case "hatchback": System.out.println("����������� ����������� �������� �� �������, ");
		case "bigsuv": System.out.println("����� ��������� ����������� � �������, � �� �����");
		}
	}
	
	// ���� bodySUV=true, �� ��� �����������, �������� ������������ ����������� ������� � ����������� ����� ������
	public boolean bodySUV;	  // ����� �����������
	public void hasBodySUV(boolean hasBodySUV){
		if (hasBodySUV==true) {
			System.out.println("����������� �������. ����������� ����� ������.");
		}
		else {
			System.out.println("�������� ������.");
		}
	}
	
	// ���� increasedRearSeat=true �� ����� ��� ������ ���������� ���������, �������� ��� ��������
	public boolean increasedRearSeat;	  // ����������� ����� ��� ������ ����������
	public void hasIncreasedRearSeat(boolean hasIncreasedRearSeat){
		if (hasIncreasedRearSeat==true) {
			System.out.println("����� ��� ������ ���������� ���������. ����� ����������� ������ ����� ������. ");
		}

	}


	

}
