
import java.util.Scanner;

public class DayOfWeek {

	public static void main(String[] args) {
		
		Integer numberOfWeek = 0; 
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter yuor number: ");
		
		if (sc.hasNextInt()) {                                               // проверяем введено ли число
			numberOfWeek = sc.nextInt();
			if ((numberOfWeek>=1) & (numberOfWeek<=7))                       // проверяем, чтобы число было от 1 до 7
				switch (numberOfWeek) {
				case 1: System.out.print("Monday."); break;
				case 2: System.out.print("Tuesday."); break;
				case 3: System.out.print("Wednesday."); break;
				case 4: System.out.print("Thursday."); break;
				case 5: System.out.print("Friday."); break;
				case 6: System.out.print("Saturday."); break;
				case 7: System.out.print("Sunday."); break;
			}
			else {
				System.out.println("В неделе семь дней, поэтмоу введите число от 1 до 7");			
			}
			
		}
		else {
			System.out.print("Ошибка: введите число от 1 до 7: ");
		}
		sc.close();
		
		
	}

}
