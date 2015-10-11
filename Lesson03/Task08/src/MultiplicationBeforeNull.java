
public class MultiplicationBeforeNull {

	public static void main(String[] args) {
		
		int ar[] = new int[10];
		for (int i=0; i<10; i++) {
			ar[i] = (int)((Math.random()*5)+1);
		}
		
		System.out.print("Массив случайных чисел от 0 до 5: ");
		for (int i=0; i<10; i++) {
			if (i==9) {
				System.out.println(ar[i] + "."); break;
			}
			System.out.print(ar[i] + ", ");
		}
		
		int mult = 1;
		int numberOfNull = 0;
		for (int i=0; i<10; i++) {
			if (ar[i]!=0) {
				mult = mult * ar[i];
				numberOfNull = numberOfNull +1;
			}
			else break;
		}
		if (ar[0]==0) {
			System.out.println("Нулю равен первый элемент. Невозможно удовлетворить условию задачи.");
		} else {
			if (numberOfNull == 10) {
				System.out.println("В массиве нет ни одного нуля.");
			}	
			else {
				System.out.println("Произведение элементов до первого нуля равна: " + mult + ".");
			}
		}
		

	}

}
