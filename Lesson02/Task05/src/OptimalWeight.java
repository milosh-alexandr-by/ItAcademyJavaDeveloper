
import java.util.Scanner;

public class OptimalWeight {
	
	// проверить окончание килограммов

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your height, см: ");
		Double rost = sc.nextDouble();
		System.out.print("Enter your weight, кг: ");
		Double ves = sc.nextDouble();
		sc.close();
		double optimalVes = rost - 100;
		if (optimalVes < ves) {
			System.out.println("Вам нужно похудеть на " + (ves-optimalVes) + " килограмм");
		}
		if (optimalVes > ves) {
			System.out.println("Вам нужно набрать " + (optimalVes-ves) + " килограмм");
		}
		if (optimalVes == ves) {
			System.out.println("Вы в иедальной форме!");
		}
	}
	

}
