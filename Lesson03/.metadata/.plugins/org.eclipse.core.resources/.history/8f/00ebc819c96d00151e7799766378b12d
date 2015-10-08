
public class MinAndIndex {

	public static void main(String[] args) {
		
		int myArray[] = new int[15];
		for (int i=0; i<15; i++) {
			myArray[i] = (int)(Math.random()*100);
		}
		System.out.print("ћассив случайных чисел от 0 до 100: ");
		for (int i=0; i<15; i++) {
			if (i==14) {
				System.out.println(myArray[i] + "."); break;
			}
			System.out.print(myArray[i] + ", ");
		}
		int k = 0;
		int min = myArray[0];
		for (int i=1; i<15; i++) {
			if (myArray[i]<min) {
				min = myArray[i];
				k = i;
			}
		}
		
		System.out.println("ћаксимальное значение в массиве: " + min + ", которое соответствует индексу: " + k + ".");

	}

}
