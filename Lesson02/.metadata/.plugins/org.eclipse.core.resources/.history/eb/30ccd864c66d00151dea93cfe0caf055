
import java.util.Scanner;

public class CorrectRouble {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Введите количество рублей: ");
		Integer rouble = sc.nextInt();
		sc.close();
				
		int g = rouble%100;           // нам важны только две последние цифры числа
				
		if ((g >= 11) & ( g<= 14))  {              // прописываем "рублей" для чисел 11, 12, 13, 14
			System.out.println(rouble + " рублей.");
		}
		else {                                          // прописываем значения для остальных окончаний
			int p = g%10;
			switch (p){
			case 1:
				System.out.println(rouble + " рубль."); break;
			case 2: 
			case 3:
			case 4:
				System.out.println(rouble + " рубля."); break;
			case 5: 
			case 6: 
			case 7: 
			case 8:
			case 9:
			case 0:
				System.out.println(rouble + " рублей."); break;
			}
		}
		

	}

}
