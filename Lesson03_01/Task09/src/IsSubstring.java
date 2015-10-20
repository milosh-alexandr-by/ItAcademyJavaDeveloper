import java.util.Scanner;

public class IsSubstring {

	public static void main(String[] args) {

		Scanner sc1 = new Scanner(System.in);
		System.out.print("Enter your text: ");
		String text1 = sc1.nextLine();

		Scanner sc2 = new Scanner(System.in);
		System.out.print("Enter your text: ");
		String text2 = sc2.nextLine();

		char[] arr = text1.toCharArray();

		// алгоритм: берём базовую строку и строим строки со сдвигом
		// первый элемент становится в конец строки, а все остальные сдигаются на одну позицию влево
		// и деелать так, пока элементы не пройдут весь круг
		// при этом каждый раз нашу строку сравниваем с text2
		// если нашлось хоть одно совпадение, то sum = sum+1; то есть метод работает
		int sum = 0; 
		for (int z = 0; z < arr.length; z++) {
			char a = arr[0];
			for (int i = 0; i < arr.length - 1; i++) {
				arr[i] = arr[i + 1];
			}
			arr[(arr.length) - 1] = a;


			String output = String.valueOf(arr);

			if (output.equals(text2)) {
				sum = sum + 1;
			}

		}

		String output = String.valueOf(arr);

		if (sum > 0) {
			System.out.println("Метод работает");
		}
	}

}
 // waterbottle
 // erbottlewat
