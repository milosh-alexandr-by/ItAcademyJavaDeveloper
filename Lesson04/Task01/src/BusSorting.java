/* 
 * В этом классе создаётся массив автобусов, используемых автобусным парком.
 * Массив выводится на экран.
 * На экран выводятся автобусы, которые мы ищем по условию задачи:
 *  - для заданного маршрута;
 *  - эксплутируются больше заданного срока.
 *  - пробег у которых больше заданного расстояния. * 
 */
public class BusSorting {

	public static void main(String[] args) {
	
		// создадим массив автобусов
		Bus[] arr = new Bus[10];
		arr[0] = new Bus("Ivanov", 1251, 77, "Ikarus", 1995, 50000);
		arr[1] = new Bus("Petrov", 1252, 52, "Ikarus", 1995, 55000);
		arr[2] = new Bus("Sidorov", 1253, 52, "Ikarus", 1997, 35000);
		arr[3] = new Bus("Klimuk", 4445, 8, "BelKommunMash", 2012, 2000);
		arr[4] = new Bus("Kovalenok", 4460, 12, "MAZ", 2005, 15000);
		arr[5] = new Bus("Masherov", 1313, 12, "MAZ", 2008, 10000);
		arr[6] = new Bus("Dobkin", 9521, 44, "MAZ", 2011, 5000);
		arr[7] = new Bus("Gleb", 3365, 44, "Ikarus", 2001, 18000);
		arr[8] = new Bus("Pushkin", 1200, 44, "Ikarus", 2001, 10000);
		arr[9] = new Bus("Prokopovich", 1250, 77, "Mersedes-benz", 2015, 300);
		
		Bus.matrixOfBus(arr);
		
		Bus.thisRoute(arr);

		Bus.thisYear(arr);

		Bus.thisMileage(arr);
			
	}
}

