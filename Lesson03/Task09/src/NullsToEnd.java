
public class NullsToEnd {

	public static void main(String[] args) {

		// создадим массив случайных чисел от 0 до 5
		int ar[] = new int[10];
		for (int i=0; i<10; i++) {
			ar[i] = (int)((Math.random()*5));
		}
		
		// выведем массив на экран
		System.out.print("Массив случайных чисел от 0 до 5: ");
		for (int i=0; i<10; i++) {
			if (i==9) {
				System.out.println(ar[i] + "."); break;
			}
			System.out.print(ar[i] + ", ");
		}
		
		// логика решения: инициализируем новый массив, который заполнится нулями
		// потом туда будем закидывать ненулевые значения базового массива
		// а оставшееся место нового массива уже будет заполнено нулями
		int nov[] = new int[10];
		
		int k = 0;
		for (int i=0; i<10; i++) {
			if (ar[i]==0) continue;         // если в базовом массиве ноль - в новый его не добавляем, а переходим к следующему элементу базового массива
			nov[k] = ar[i];
			k = k+1;
		}
		
		// выведем на экран новый массив
		System.out.print("Новый массив:                     ");
		for (int i=0; i<10; i++) {
			if (i==9) {
				System.out.println(nov[i] + "."); break;
			}
			System.out.print(nov[i] + ", ");
		}


	}

}
