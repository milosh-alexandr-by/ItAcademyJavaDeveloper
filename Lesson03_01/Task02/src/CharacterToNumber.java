
import java.util.Scanner;

public class CharacterToNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your text: ");
		String text = sc.nextLine();

		char[] symbol = text.toCharArray();
		for (int i=0; i<symbol.length; i++){
			System.out.print(symbol[i] + "  ");
		}
		text = text.toLowerCase();
		System.out.println();
		for (int j=0; j<text.length(); j++) {
			if (Character.isLetter(symbol[j])) {
				System.out.printf("%-3s", (text.codePointAt(j)-96));
			}
			else System.out.printf("%-3s", " ");
		}
		
		char p = 99;
//		System.out.println(p);
		
		
	}

}

 // Sasha and Masha!