/*
 * Класс, в котором пользователь выбирает локаль (русскую или английскую).
 * А также создаются файлы lang.properties, в которых хранятся ключи языков
 */
package car;

import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

public class SelectLanguage {

	public static Locale loc = null;
	public static ResourceBundle rb;
	public static void selectLanguage() {
		Scanner sc = new Scanner(System.in);		
		System.out.println("Выберите язык/select language:");
		System.out.println("1. Русский.");
		System.out.println("2. English.");
		int i = sc.nextInt();
		
		switch(i){
			case 1: loc = new Locale("ru", "RU"); break;
			case 2: loc = new Locale("en", "US"); break;
		}
		
	rb = ResourceBundle.getBundle("car/lang", loc);	
	
	}
	
}