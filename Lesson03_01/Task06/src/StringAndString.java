import java.util.Scanner;


public class StringAndString {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter tour text: ");
		String text = sc.nextLine();

		String[] str = text.split(" ");

		for (int i=0; i<str.length; i++){
			char[] arr = str[i].toCharArray();
				for (int j=0; j<arr.length; j++){
					System.out.print(arr[j]);
				}
			System.out.print(" ");	
		}
			
		
		

	}

}