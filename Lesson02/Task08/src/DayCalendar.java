
import java.util.*;

public class DayCalendar {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
//		sc.useLocale(Locale.US);
		System.out.println("Введите дату в формате: число.месяц.год. (Нарпример: 9.05.1945)");
		System.out.print("Your date: ");
		String date = sc.nextLine();
		sc.close();
		
		String[] numbers = date.split("\\.");
		
		Integer d = Integer.valueOf(numbers[0]);    // число месяца
		Integer M = Integer.valueOf(numbers[1]);    // номер месяца
		
		int m = 0;             // упорядочиваем месяцы согласно Древнему Риму
		if (M==1) {
			m = 11;
		}
		else {
			if (M==2) {
				m = 12;
			}
			else {
				m = M-2;
			}
		}
		
		Integer y = Integer.valueOf(numbers[2]);     // номер года согласно Древнему Риму
		int Y = y%100;
		if ((m==11) | (m==12)) {
			Y = Y-1;
		}
		
		int c = y/100;
		int summ1 =(13*m-1)/5;
		int summ2 = Y/4;
		int summ3 = c/4;
		
		int day = (d + summ1 + Y + summ2 + summ3 - (2*c)+777)%7;
		
		System.out.print("It was ");
		switch (day) {
		case 1: System.out.print("monday."); break;
		case 2: System.out.print("tuesday."); break;
		case 3: System.out.print("wednesday."); break;
		case 4: System.out.print("thursday."); break;
		case 5: System.out.print("friday."); break;
		case 6: System.out.print("saturday."); break;
		case 7: System.out.print("sunday."); break;
		}
	}

}
