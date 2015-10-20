
import java.util.Scanner;

public class MainDiagonal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Введите n: ");
		Integer n = sc.nextInt();
		
		// создадим матрицу из случайных чисел от 0 до 10
		int myMatrix[][] = new int[n][n];
		for (int i=0; i<n; i++) {
			for (int j=0; j<n; j++) {
				myMatrix[i][j] = (int)(Math.random()*10); 
				
			}
		}
		
		// выведем матрицу на экран
		System.out.println("Сгенерированная матрица:");
		for (int i=0; i<n; i++) {
			if (i>0) {
				System.out.println();
			}	
			for (int j=0; j<n; j++) {
				System.out.print(myMatrix[i][j] + "  ");				
			}
		}
		System.out.println();
		
		// выведем на экран элементы главной диагонали, то есть k - от 0 до 9  M[k][k]		
		System.out.print("Элементы главной диагонали: ");
		for (int k=0; k<n; k++) {
			if (k==(n-1)) {
				System.out.println(myMatrix[k][k] + "."); break;
			}
			System.out.print(myMatrix[k][k] + ", ");
		}
		
		// выведем на экран элементы побочной диагонали
		System.out.print("Элементы побочной диагонали: ");
		for (int p=0; p<n; p++) {
			if (p==(n-1)) {
				System.out.println(myMatrix[p][n-p-1] + "."); break;
			}
			System.out.print(myMatrix[p][n-p-1] + ", ");
		}
		sc.close();
	}

}
