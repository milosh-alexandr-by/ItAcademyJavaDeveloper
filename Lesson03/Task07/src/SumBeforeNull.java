
public class SumBeforeNull {

	public static void main(String[] args) {
		int ar[] = new int[10];
		for (int i=0; i<10; i++) {
			ar[i] = (int)((Math.random()*5));
		}
		
		System.out.print("������ ��������� ����� �� 0 �� 5: ");
		for (int i=0; i<10; i++) {
			if (i==9) {
				System.out.println(ar[i] + "."); break;
			}
			System.out.print(ar[i] + ", ");
		}
		
		int sum = 0;
		for (int i=0; i<10; i++) {
			if (ar[i]!=0) {
				sum = sum + ar[i];
			}
			else break;
		}
		
		if (ar[0]==0) {
			System.out.println("���� ����� ������ �������. ���������� ������������� ������� ������.");
		}
		else {
			System.out.println("����� ��������� �� ������� ���� �����: " + sum + ".");
		}
	}

}
