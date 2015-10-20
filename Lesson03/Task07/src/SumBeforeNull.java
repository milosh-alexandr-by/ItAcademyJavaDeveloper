
public class SumBeforeNull {

	public static void main(String[] args) {
		// создаём массив. случайные числа от 0 до 10
		int ar[] = new int[10];
		for (int i=0; i<10; i++) {
			ar[i] = (int)((Math.random()*10));
		}
		
		// выводим массив на экран
		System.out.print("Массив случайных чисел от 0 до 5: ");
		for (int i=0; i<10; i++) {
			if (i==9) {
				System.out.println(ar[i] + "."); break;
			}
			System.out.print(ar[i] + ", ");
		}
		
		// считаем сумму элементов до тех пор, пока они не равны нулю
		// как только элемент равен нулю - делаем break и выходим из цикла
		int sum = 0;
		int numberOfNull = 0;
		for (int i=0; i<10; i++) {
			if (ar[i]!=0) {
				sum = sum + ar[i];
				numberOfNull = numberOfNull +1;
			}
			else break;
		}
		
		// пишем три условия, когда ноль - первый элемент, когда нет нулей и собственно выводим сумму
		if (ar[0]==0) {
			System.out.println("Нулю равен первый элемент. Невозможно удовлетворить условию задачи.");
		}
		else {
			if (numberOfNull == 10) {
				System.out.println("В массиве нет ни одного нуля.");
			}
			else {
				System.out.println("Сумма элементов до первого нуля равна: " + sum + ".");
			}
		}
	}

}
