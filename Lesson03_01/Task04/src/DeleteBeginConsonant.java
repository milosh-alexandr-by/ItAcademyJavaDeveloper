
import java.util.Scanner;

public class DeleteBeginConsonant {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your text: ");
		String text = sc.nextLine();
		Scanner sc2 = new Scanner(System.in);
		System.out.print("Введите длину слов, которые вы будете удалять: ");
		String dlinaSlov = sc.nextLine();
		Integer dlinaSlovInt = Integer.valueOf(dlinaSlov);
		String vowels = "aeiouAEIOU";
		
		
		String[] str = text.split(" ");
		for (int i=0; i<str.length; i++) {
//			CharSequence cs = str[i].charAt(0);
//			CharSequence seq = java.nio.CharBuffer.wrap(str[]);
			if ((str[i].length() == dlinaSlovInt) & !str[i].startsWith("a") & !str[i].startsWith("e") & !str[i].startsWith("i") & !str[i].startsWith("o") & !str[i].startsWith("u") & !str[i].startsWith("A") & !str[i].startsWith("E") & !str[i].startsWith("I") & !str[i].startsWith("O") & !str[i].startsWith("U")) {
				
			}
			else {
				char[] arr = str[i].toCharArray();

				for (int j=0; j<arr.length; j++){
					System.out.print(arr[j]);
				}
				System.out.print(" ");	
			}	
		}
		


	}

}
 // a ab abc abcd b bc bcd bcde
// str[i].length() != dlinaSlovInt) & 