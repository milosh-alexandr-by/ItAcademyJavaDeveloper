
import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of year: ");
		Integer year = sc.nextInt();
		sc.close();
		
		if (year%400 == 0) {
			System.out.println("Leap year.");
		}
		else {
			if (year%100 == 0) {
				System.out.println("Not a lLeap year.");
			}
			else {
				if (year%4 == 0) {
					System.out.println("Leap year.");
				}
				else {
					System.out.println("Not a lLeap year.");
				}
			}
		}

	}

}
