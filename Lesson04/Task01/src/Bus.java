public class Bus {

	String driverSurname;    // фамилия водитела
	int busNumber;           // номер автобуса
	int routeNumber;         // номер маршрута
	String busBrand;         // марка автобуса
	int yearBeginUse;        // год начал эксплуатации
	int mileage;             // пробег

	Bus(String driverSurname, int busNumber, int routeNumber, String busBrand,
			int yearBeginUse, int mileage) {

		this.driverSurname = driverSurname;     // фамилия водитела
		this.busNumber = busNumber;		        // номер автобуса
		this.routeNumber = routeNumber;         // номер маршрута
		this.busBrand = busBrand;               // марка автобуса
		this.yearBeginUse = yearBeginUse;       // год начал эксплуатации
		this.mileage = mileage;                 // пробег
	}

	public void avtobus() {
		System.out.printf("%-15s%-15s%-15s%-15s%-15s%-15s%n", driverSurname,
				busNumber, routeNumber, busBrand, yearBeginUse, mileage);
	}

	public static void thisRoute(int numberOfRoute1, Bus[] massiv) {
		System.out.println();
		int numberOfRoute = numberOfRoute1;
		System.out.printf("%-2s%-15s%-15s%-15s%-15s%-15s%-15s%n", "№  | ",
				"DriverSurname", "busNumber", "routeNumber", "busBrand",
				"yearBeginUse", "mileage");
		System.out
				.println("-----------------------------------------------------------------------------------------");
		Bus[] arr = new Bus[10];
		for (int i = 0; i < massiv.length; i++) {
			arr[i] = massiv[i];
			if (arr[i].routeNumber == numberOfRoute) {
				if (i < 9) {
					System.out.print((i + 1) + "  | ");
					arr[i].avtobus();
				} else {
					System.out.print((i + 1) + " | ");
					arr[i].avtobus();
				}
			}
		}
	}

	public static void thisYear(int yearOfBeginUse1, Bus[] massiv1) {
		System.out.println();
		int yearOfBeginUse = yearOfBeginUse1;
		System.out.printf("%-2s%-15s%-15s%-15s%-15s%-15s%-15s%n", "№  | ",
				"DriverSurname", "busNumber", "routeNumber", "busBrand",
				"yearBeginUse", "mileage");
		System.out
				.println("-----------------------------------------------------------------------------------------");
		Bus[] arr = new Bus[10];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = massiv1[i];
			if (arr[i].yearBeginUse < yearOfBeginUse) {
				if (i < 9) {
					System.out.print((i + 1) + "  | ");
					arr[i].avtobus();
				} else {
					System.out.print((i + 1) + " | ");
					arr[i].avtobus();
				}
			}
		}
	}

	public static void thisMileage(int mileageOf1, Bus[] massiv2) {
		System.out.println();
		int mileageOf = mileageOf1;
		System.out.printf("%-2s%-15s%-15s%-15s%-15s%-15s%-15s%n", "№  | ",
				"DriverSurname", "busNumber", "routeNumber", "busBrand",
				"yearBeginUse", "mileage");
		System.out
				.println("-----------------------------------------------------------------------------------------");
		Bus[] arr = new Bus[10];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = massiv2[i];
			if (arr[i].mileage > mileageOf) {
				if (i < 9) {
					System.out.print((i + 1) + "  | ");
					arr[i].avtobus();
				} else {
					System.out.print((i + 1) + " | ");
					arr[i].avtobus();
				}
			}
		}
	}

}
