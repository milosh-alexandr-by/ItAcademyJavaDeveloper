/*
 * ����, ������� ����������� �� ���������� Comparator.
 * �������������� ����� compare() ��� ���������� ���������� �� ����.
 */
package car;

import java.util.Comparator;

import car.Car;

public class SortedByPrice implements Comparator<Car> {
	
public int compare(Car obj1, Car obj2) {
		
		int fc1 = obj1.getPrice();
		int fc2 = obj2.getPrice();
		
		if (fc1>fc2) {
			return 1;
		}
		else if (fc1<fc2) {
			return -1;
		}
		else {
			return 0;
		}
		
		
		
	}

}
