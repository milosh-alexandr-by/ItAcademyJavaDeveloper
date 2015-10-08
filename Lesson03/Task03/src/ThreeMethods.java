
import java.util.Scanner;

public class ThreeMethods {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите переменные через enter: "); 
		int firstArray[] = new int[15];
		for (int i=0; i<15; i++) {
			firstArray[i]=sc.nextInt();
		}
		
		int secondArray[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
		
		int thirdArray[] = new int[15];
		for (int i=0; i<15; i++) {
			thirdArray[i]= (int)(Math.random()*10);
		}

		System.out.print("Первый массив: ");
		for (int i=0; i<15; i++) {
			if (i==14) {
				System.out.println(firstArray[i]+ "."); break;
			}
			System.out.print(firstArray[i]+ ", ");;
		}
		System.out.print("Второй массив: ");
		for (int i=0; i<15; i++) {
			if (i==14) {
				System.out.println(firstArray[i]+ "."); break;
			}
			System.out.print(secondArray[i]+ ", ");;
		}
		System.out.print("Третий массив: ");
		for (int i=0; i<15; i++) {
			if (i==14) {
				System.out.println(firstArray[i]+ "."); break;
			}
			System.out.print(thirdArray[i]+ ", ");;
		}
		sc.close();
	}

}
