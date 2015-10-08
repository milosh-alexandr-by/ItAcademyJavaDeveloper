
import java.util.Scanner;

public class SumOfNumbers {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Введите n: ");
		Integer n= sc.nextInt();
		sc.close();
		int sum = 0;
		
		for (int i=1; i<=n; i++) {
			sum = sum + i;
		}
		
		System.out.println("Сумма чисел от 1 до  " + n + " равна: " + sum + ".");

	}

}
