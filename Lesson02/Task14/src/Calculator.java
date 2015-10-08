
import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		
		String str;
		
		//  ������ ����������� ���� while{}, � ������� ����������� ������� ������: ������ ������ ���� ����� "q".
		while (true) {
		Scanner sc = new Scanner(System.in);
		System.out.print("������� ���� ���������, �������� \"1+1\": ");
		str = sc.nextLine();
		if (str.equals("q")) {
			System.exit(0);
		};
		
		// � ������ ��������� ������ ������ ����. ����� ��� ����� � ������, ��� ��� �� ����:
		// c������� �� ������ ��c��� ��������, � ���������� ��. ���� ������ ��������� � + ��� - ��� * ��� /, �� ���������� ����� ������� � ��� ������

		int numberOfSign = 0;
		char sign = '0';
		char[] chArray = str.toCharArray();
		for (int i=0; i<str.length(); i++) {
			if ( (chArray[i] == '+') | (chArray[i] == '*') | (chArray[i] == '-') | (chArray[i] == '/') )  {
				numberOfSign = i;
				sign = chArray[i];    //���� ������ ����� �����, �� ������� ����� ������ � ���������� �����
				if ( (chArray[i] == '+') | (chArray[i] == '*') | (chArray[i] == '/') ) break;       //   ��� ��� ����, ����� �� ��������� ����� � ������� �����        
				
			}
		}
		
		// �������� ������ �� ��� ��������: �� ����� � ����� �����; � �������� ��� �������� � ��� double
		String firstHalf = str.substring(0, numberOfSign);
		  Double firstCharacter = Double.valueOf(firstHalf);
		  
		String secondHalf = str.substring(numberOfSign+1);
		  Double secondCharacter = Double.valueOf(secondHalf);

		// � ����������� �� �����, ������� �� ��� �����, ��������� ���������������� ��������
		switch (sign) {
		case '+': System.out.println(firstCharacter+secondCharacter); break;
		case '-': System.out.println(firstCharacter-secondCharacter); break;
		case '*': System.out.println(firstCharacter*secondCharacter); break;
		case '/': System.out.println(firstCharacter/secondCharacter); break;
		}
		System.out.println("��� ������ ������� \"q\".");
		
		}
	
	
		
	}

}
