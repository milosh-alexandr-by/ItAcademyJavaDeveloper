
import java.util.*;

public class QuotientTwoNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.US);
		System.out.print("Enter first number: ");
		Double d1 = sc.nextDouble(); 
		System.out.print("Enter second number: ");
		Double d2 = sc.nextDouble();
		if (d2 == 0) {
			System.out.println("На ноль делить нельзя.");
		}
		else {
			System.out.printf("Частное от деления двух чисел равно: " + "%.2f", d1/d2);
		}	
		sc.close();

	}

}
