/*
 * ���������� � �������� ������.
 */

package closeCar;
import car.Car;


public class CloseCar extends Car {

	// ���� roof = true �� ������ � ������
	public final boolean roof = true;
	
	// ���������� ���� �� �������� �����, ��������� �� ������
	public boolean truckBody;	  // �������� �����
	public void hasTruckbody(boolean hasTruckBody){
		if (hasTruckBody==true) {
			System.out.println("� ������ ���� �������� �����, ��������� �� ������.");
		}
		else {
			System.out.println("� ������ ��� ��������� ������");
		}
	}
	
	// ���� �� ��������
	public boolean trunk;	  // ��������
	public void hastrunk(boolean hastrunk){
		if (hastrunk==true) {
			System.out.println("� ������ ���� ��������.");
		}
		else {
			System.out.println("������ ������� �� ������������� ������.");
		}
	}
	
	// ���� �� �����, ������� ����������� �� ������������ �������
	public boolean railDoor;	  // ����� �� ������������
	public void hasRailDoor(boolean hasRailDoor){
		if (hasRailDoor==true) {
			System.out.println("� ������ ������ ����� ����������� �� ������������.");
		}
		else {
			System.out.println("������ ����� ����������� ��� �������");
		}
	}
	
	

}
