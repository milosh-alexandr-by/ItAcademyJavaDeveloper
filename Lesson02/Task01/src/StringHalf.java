
import java.util.Scanner;       

public class StringHalf {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);               // ������ ������ ������ Scanner
		System.out.print("Enter yuor string: ");
		String yourString = sc.nextLine();                 // ���� ����� ������ � ����������
		int numberOfCharacter = yourString.length();       // ��������� ���������� �������� � ������
		System.out.println("Number of characters in your string: " + numberOfCharacter + ".");
		sc.close();
		
		// ������� ��������� �� ������, ���� ����� ������ ���� ������
		if (numberOfCharacter == 1) {
			System.out.println("�� ����� ������ ������ � ����� ��������, � � ������ ������� �� ��� ������");
		}
		
		// ���������, ������ ��� ��������� ���������� �������� � ������
		if (numberOfCharacter%2 != 0) {
			System.out.println("� ��� �������� ���������� �������� � ������, ������� �������� � �� ��� ������"
					+ " �� " + ((numberOfCharacter/2)+1) + " � " + numberOfCharacter/2 + " ��������" + ".");
			String newFirstString = yourString.substring(0, ((numberOfCharacter/2)+1));         // ������ ������ ����� ������ �� ������ ���������
			String newSecondString = yourString.substring(((numberOfCharacter/2)+1));           // ������ ������ ����� ������ �� ������ ���������
			System.out.println("Your new first string: " + newFirstString + "\n" + "Your new second string: " + newSecondString);
		}
		else {
			System.out.println("�������� ���� ������ �� ��� ������ �� " + numberOfCharacter/2 + " ��������" + ".");
			String newFirstString = yourString.substring(0, numberOfCharacter/2);
			String newSecondString = yourString.substring(numberOfCharacter/2);
			System.out.println("Your new first string: " + newFirstString + "\n" + "Your new second string: " + newSecondString);
		}
		
		// ERROR: ��������� ��������� ����� "�������", � ����������� �� �����
		
	}

}
