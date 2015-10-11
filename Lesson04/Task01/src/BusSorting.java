import java.util.Scanner;

public class BusSorting {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

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

		System.out.printf("%-2s%-15s%-15s%-15s%-15s%-15s%-15s%n", "№  | ",
				"DriverSurname", "busNumber", "routeNumber", "busBrand",
				"yearBeginUse", "mileage");
		System.out.println("-----------------------------------------------------------------------------------------");
		for (int i = 0; i < arr.length; i++) {
			if (i < 9) {
				System.out.print((i + 1) + "  | ");
				arr[i].avtobus();
			} else {
				System.out.print((i + 1) + " | ");
				arr[i].avtobus();
			}
		}
		System.out.println();
		System.out.println("Вывести список автобусов для заданного маршрута.");
		System.out.print("Введите номер маршрута: ");
		Integer x = sc.nextInt();
		Bus.thisRoute(x, arr);

		System.out.println();
		System.out.println("Вывести список автобусов,которые эксплутируются больше заданного срока.");
		System.out.print("Введите год ввода в эксплуатацию: ");
		Integer y = sc.nextInt();
		Bus.thisYear(y, arr);

		System.out.println();
		System.out.println("Вывести список автобусов, пробег у которых больше заданного расстояния.");
		System.out.print("Введите пробег: ");
		Integer z = sc.nextInt();
		Bus.thisMileage(z, arr);
		
		sc.close();

	}

}
