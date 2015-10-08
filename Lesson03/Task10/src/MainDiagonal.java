
import java.util.Scanner;

public class MainDiagonal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("������� n: ");
		Integer n = sc.nextInt();
		
		int myMatrix[][] = new int[n][n];
		for (int i=0; i<n; i++) {
			for (int j=0; j<n; j++) {
				myMatrix[i][j] = (int)(Math.random()*10); 
				
			}
		}
		System.out.println("��������������� �������:");
		for (int i=0; i<n; i++) {
			if (i>0) {
				System.out.println();
			}	
			for (int j=0; j<n; j++) {
				System.out.print(myMatrix[i][j] + "  ");				
			}
		}
		System.out.println();
		
		System.out.print("�������� ������� ���������: ");
		for (int k=0; k<n; k++) {
			if (k==(n-1)) {
				System.out.println(myMatrix[k][k] + "."); break;
			}
			System.out.print(myMatrix[k][k] + ", ");
		}
		
		System.out.print("�������� �������� ���������: ");
		for (int p=0; p<n; p++) {
			if (p==(n-1)) {
				System.out.println(myMatrix[p][n-p-1] + "."); break;
			}
			System.out.print(myMatrix[p][n-p-1] + ", ");
		}
		sc.close();
	}

}
