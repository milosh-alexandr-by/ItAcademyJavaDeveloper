
import java.util.Scanner;

public class HelloUser {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите имя: ");
		String userName = sc.nextLine();
		System.out.println("Ваше имя" + userName + "!");

	}

}
