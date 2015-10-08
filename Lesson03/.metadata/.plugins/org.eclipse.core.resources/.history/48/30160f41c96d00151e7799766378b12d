
public class NegativNumber {

	public static void main(String[] args) {
		
		System.out.print("Массив случайных чисел от -100 до 100: ");
		int ar[] = new int[10];
		for (int i=0; i<10; i++) {
			ar[i] = (int)((Math.random()*200)-100);
		}
		
		System.out.print("Массив: ");
		for (int i=0; i<10; i++) {
			if (i==9) {
				System.out.println(ar[i] + "."); break;
			}
			System.out.print(ar[i] + ", ");
		}
		
		int sum = 0;
		for (int i=0; i<10; i++) {
			if (ar[i]<0) {
				sum = sum +1;
			}
		}
		if (sum == 0) {
			System.out.println("В массиве нет отрицательных элементов.");
		}
		else {
			System.out.println("В массиве " + sum + " отрицательных элементов.");
		}	
	}

}
