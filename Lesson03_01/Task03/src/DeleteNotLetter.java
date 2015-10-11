
import java.util.Scanner;

public class DeleteNotLetter {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your text: ");
		String text = sc.nextLine();
		
		char[] symbol = text.toCharArray();
		for (int i=0; i<symbol.length; i++){
			if (Character.isLetter(symbol[i]) | symbol[i]==' ')
			System.out.print(symbol[i]);
		}

	}

}
