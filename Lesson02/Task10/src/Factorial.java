
import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter n: ");
		Integer n= sc.nextInt();
		sc.close();
		
		int f = 1;
		if (n<0) {
			System.out.println("Факториал от отрицательного числа брать нельзя.");
		}
		else {
			if (n==0) {
				System.out.println("Факториал равен: 1.");
			}
			else {
				for (int i=1; i<=n; i++) {
					f = f*i;
				}
				System.out.println("Факториал равен: " + f + ".");
			}
		}
			

	}

}
