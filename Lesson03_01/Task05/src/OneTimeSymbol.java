
import java.util.Scanner;

public class OneTimeSymbol {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your text: ");
		String text = sc.nextLine();
		
		int sum = 0;
		char[] symbol = text.toCharArray();
		for (int i=0; i<((symbol.length)-1); i++){
			for (int j=i+1; j<symbol.length; j++) {
				if (symbol[i]==symbol[j]) {
					sum = sum+1;
				}
			}
		}
		if (sum == 0) {
			System.out.println("Все символы разные.");
		}
		else {
			System.out.println("Есть повторяющиеся символы.");
		} 
		
	}

}
