
import java.util.Scanner;

public class CompressionString {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter tour text: ");
		String text = sc.nextLine();

		// должны получит строку
		// использовать StringBuffer
		
		int m = 1;
		char[] arr = text.toCharArray();
		for (int i=0; i<(arr.length-1); i++) {
			if (arr[i] == arr[i+1]) {
				m = m+1;
				if (i == (arr.length-2)) {
					System.out.print(arr[i]);System.out.print(m);
				}
				continue;				
			}
			System.out.print(arr[i]);System.out.print(m);
			m = 1;
		}
		if (m == 1) {
			System.out.print(arr[arr.length-1]);System.out.print(m);
		}

//		int m = 1;
//		for (int i=0; i<str.length; i++) {
//			if (str[])
//		}
//		
//		for (int i=0; i<str.length; i++){
//			char[] arr = str[i].toCharArray();
//				for (int j=0; j<arr.length; j++){
//					System.out.print(arr[j]);
//				}
//			System.out.print(" ");	
//		}
		
	}

}
 // aaabccccaaa