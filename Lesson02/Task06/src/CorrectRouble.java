
import java.util.Scanner;

public class CorrectRouble {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("������� ���������� ������: ");
		Integer rouble = sc.nextInt();
		sc.close();
				
		int g = rouble%100;           // ��� ����� ������ ��� ��������� ����� �����
				
		if ((g >= 11) & ( g<= 14))  {              // ����������� "������" ��� ����� 11, 12, 13, 14
			System.out.println(rouble + " ������.");
		}
		else {                                          // ����������� �������� ��� ��������� ���������
			int p = g%10;
			switch (p){
			case 1:
				System.out.println(rouble + " �����."); break;
			case 2: 
			case 3:
			case 4:
				System.out.println(rouble + " �����."); break;
			case 5: 
			case 6: 
			case 7: 
			case 8:
			case 9:
			case 0:
				System.out.println(rouble + " ������."); break;
			}
		}
		

	}

}
