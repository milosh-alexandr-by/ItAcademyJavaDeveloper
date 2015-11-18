/*
 * Клас, который наследуется от интерфейса Comparator.
 * Переопределяет метод compare() для сортировки таксопрака по цене.
 */
import java.util.Comparator;

public class SortedByPrice implements Comparator<TaxiCars> {
	
public int compare(TaxiCars obj1, TaxiCars obj2) {
		
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