
import java.util.Locale;
import java.util.Scanner;

public class MaxAndMin {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.US);
		System.out.println("������� ���������� ����� enter: ");
		int myArray[] = new int[10];
		for (int i=0; i<myArray.length; i++) {
			myArray[i] = sc.nextInt();
		}

		int max = myArray[0];
		int min = myArray[0];
		for (int i=1; i<myArray.length; i++) {
			if (myArray[i]>max) max=myArray[i];
			if (myArray[i]<min) min=myArray[i];
		}
		
		System.out.println("min value = " + min);
		System.out.println("max value = " + max);
		sc.close();
	}

}
