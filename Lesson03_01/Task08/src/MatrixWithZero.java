
import java.util.Scanner;

public class MatrixWithZero {

	public static void main(String[] args) {

		System.out.println("Введите размеры матрицы.");
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Количество строк M: ");
		Integer m = sc1.nextInt();
		
		Scanner sc2 = new Scanner(System.in);
		System.out.println("Количество столбцов: N");
		Integer n = sc2.nextInt();
		
		// выведем матрицу на экран
		Integer[][] matrix = new Integer[m][n];
		for (int i=0; i<m; i++) {
			for (int j=0; j<n; j++) {
				matrix[i][j] = (int) (Math.random()*10);
			}
		}
		for (int i=0; i<m; i++) {
			for (int j=0; j<n; j++) {
				System.out.printf("%4d", matrix[i][j]);
			}
		System.out.println();	
		}

		Integer[][] newMatrix = new Integer[m][n];
		
		for (int i=0; i<m; i++) {
			for (int j=0; j<n; j++) {
				int sum = 0;
				// проходим по каждому столбцу и строке
				// если встречается 0, то susm= sum+1
				for (int stolb=0; stolb<n; stolb++) {
					if (matrix[i][stolb] == 0) {
						sum = sum +1;
					}
				for (int strok=0; strok<m; strok++) {
					if (matrix[strok][j] == 0) {
						sum = sum +1;
					}
				}
				// если sum=0 то ни одного нуля не встретилось - строка (столбец) остаётся прежним
				if (sum == 0) {
					newMatrix[i][j] = matrix[i][j];
				}
				// иначе все элементы строки (столбца) заменяются нулями
				else {
					newMatrix[i][j] = 0;
				}
				}
			}
		}
		
		// выведем новую матрицу на экран
		System.out.println("Новая матрица:");
		for (int i=0; i<m; i++) {
			for (int j=0; j<n; j++) {
				System.out.printf("%4d", newMatrix[i][j]);
			}
		System.out.println();	
		}
		
	}

}
