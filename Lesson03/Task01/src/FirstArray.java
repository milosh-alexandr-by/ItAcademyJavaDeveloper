
import java.util.*;

public class FirstArray {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.US);
		System.out.println("Введите переменные через enter: ");
		// создадим массив чисел типа float, размером 10 элеменотов
		Float ft[] = new Float[10];
		for (int i=0; i<ft.length; i++) {
			ft[i] = sc.nextFloat();
		}
		
		// выведем элементы массива на экран
		for (int k=0; k<ft.length; k++) {
			if (k==9) {
				System.out.println(ft[k] + " | "); break;   // это условие для того, чтобы все элементы выводились в одну строку,
			}                                               // а после последнего курсор перескакивал на новую строку
			System.out.print(ft[k] + " | ");
		}
		
		// посчитаем сумму элементов массива
		float sum = 0;
		for (int n=0; n<ft.length; n++) {
			sum = sum + ft[n];
		}
		
		// вычислим среднее значение
		System.out.println("average value = " + sum/10);
		sc.close();
	}
	

}
