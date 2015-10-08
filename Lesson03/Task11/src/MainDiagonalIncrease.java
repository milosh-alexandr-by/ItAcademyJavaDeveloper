import java.util.Scanner;


public class MainDiagonalIncrease {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Введите n: ");
		Integer n = sc.nextInt();
		
		int myMatrix[][] = new int[n][n];
		for (int i=0; i<n; i++) {
			for (int j=0; j<n; j++) {
				myMatrix[i][j] = (int)(Math.random()*10); 
				
			}
		}
		for (int i=0; i<n; i++) {
			System.out.println();
			for (int j=0; j<n; j++) {
				System.out.print(myMatrix[i][j] + "  ");				
			}
		}
		System.out.println();
		
		System.out.print("Элементы главной диагонали: ");
		for (int r=0; r<n; r++) {
			if (r==n-1) {
				System.out.println(myMatrix[r][r] + "."); break;
			}
			System.out.print(myMatrix[r][r] + ", ");
		}
		
		int M[] = new int[n];
		for (int i=0; i<n; i++) {
			M[i] = myMatrix[i][i];
		}
		
		
		
		
		int ar[] = new int[n];
		for (int i=0; i<n; i++) {
			ar[i] = myMatrix[i][i];
		}
		
		System.out.print("Массив:     ");
		for (int i=0; i<n; i++) {
			if (i==n-1) {
				System.out.println(ar[i] + "."); break;
			}
			System.out.print(ar[i] + ", ");
		}
		
		//  упорядочивание массива
		for (int w=0; w<n; w++) {
			int f=n;
			int min = ar[n-1];
			for (int z=n-1; z>=w; z--) {
				if (ar[z]<= min) {
					min = ar[z];
					f = z;                                // f - это позиция минимального элемента
				}
			}
			int k = f;
			for (int m=k; m>=w+1; m--){
				int a = ar[m];
				ar[m] = ar[m-1];
				ar[m-1] = a;
			}
		}
				System.out.print("Массив r[]:                    ");
		for (int i=0; i<n; i++) {
			if (i==n-1) {
				System.out.println(ar[i] + "."); break;
			}
			System.out.print(ar[i] + ", ");
		}
		
		System.out.print("Новый массив M[] для удобства: ");
		for (int i=0; i<n; i++) {
			if (i==n-1) {
				System.out.println(M[i] + "."); break;
			}
			System.out.print(M[i] + ", ");
		}
		
//		int ar[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//		int M[] = {10, 4, 3, 2, 8, 6, 7, 5, 9, 1};
//		int n=10;
		Integer X[] = new Integer[n];
		for (int i=0; i<ar.length; i++) {
			
			int son = 0;
			for (int j=0; j<M.length; j++) {
				
			
				if (ar[i]==M[j]) {
					if (son>0) {
						i=i+1;
						X[i]=j;
					}
					else {
						X[i] = j;
						son = son+1;
					
					}
				}
			}
		}
		System.out.println();
		System.out.print("Mассив X[]: ");
		for (int i=0; i<n; i++) {
			if (i==n-1) {
				System.out.println(X[i] + "."); break;
			}
			System.out.print(X[i] + ", ");
		}
		
		Integer newMatrix[][] = new Integer[n][n];
		for (int i =0; i<n; i++) {
			for (int j =0; j<n; j++) {
				newMatrix[i][j] = myMatrix[i][X[j]];
			}
			
		}
		
		for (int i=0; i<n; i++) {
			System.out.println();
			for (int j=0; j<n; j++) {
				System.out.print(newMatrix[i][j] + "  ");				
			}
		}
		
		// поменять два первых значения массива
//		int a = ar[1];
//		ar[1] = ar[0];
//		ar[0] = a;
		
		// пропихнуть k-й элемент в начало массива, а все остальный сдвинуть
//		int k = 5;
//		for (int m=k; m>=1; m--){
//			int a = ar[m];
//			ar[m] = ar[m-1];
//			ar[m-1] = a;
//		}
		
		// найти минимальный элемент массива и его номер
//		int f=10;
//		int min = ar[9];
//		for (int z=9; z>=0; z--) {
//			if (ar[z]<= min) {
//				min = ar[z];
//				f = z;
//			}
//		}
//		System.out.println("число: " + min + ", номер символа: " + f);
		
		// упорядочить элементы по возрастанию

		
		
		
		
		
		
		sc.close();
		
		}
		
		
		
		
		
		
		
		// подсчитаем количество нулей
//		int sum = 0;
//		for (int i=0; i<10; i++) {
//			if (ar[i]==0) {
//				sum = sum + 1;
//			}
//		}
//		System.out.println("Количество нулей: " + sum);
		
//		int nov[] = new int[10];
//		System.out.print("Nov Массив: ");
//		
//		int num = 0;
//		int k = 0;
//		for (int i=0; i<10; i++) {
//			if (ar[i]==0) continue;
//			nov[k] = ar[i];
//			k = k+1;
//		}
//		for (int i=0; i<10; i++) {
//			if (i==9) {
//				System.out.println(nov[i] + "."); break;
//			}
//			System.out.print(nov[i] + ", ");
//		}
		
		

//		System.out.println("num = " + num);

		// у нас sum нулей, значит надо сделать ch==sum сдвигов
//		for (int ch=0; ch<=sum; ch++) {                
//			for (int i=0; i<6; i++) {
//				if (ar[i]==0) {
//					for (int k=i; k<=(5-i); k++){
//					ar[k] = ar[k+1];
//					
//					}
//				}
//			}
//			
//		}

	




}
