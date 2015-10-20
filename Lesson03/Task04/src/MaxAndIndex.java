
public class MaxAndIndex {

	public static void main(String[] args) {
		
		int myArray[] = new int[15];
		for (int i=0; i<15; i++) {
			myArray[i] = (int)(Math.random()*100);
		}
		
		System.out.print("Массив случайных чисел от 0 до 100: ");
		for (int i=0; i<15; i++) {
			if (i==14) {
				System.out.println(myArray[i] + "."); break;
			}
			System.out.print(myArray[i] + ", ");
		}
		
		int k = 0;
		int max = myArray[0];
		for (int i=1; i<15; i++) {
			if (myArray[i]>max) {
				max = myArray[i];
				k = i;
			}
		}
		
		System.out.println("Максимальное значение в массиве: " + max + ", которое соответствует индексу: " + k + ".");

	}

}
