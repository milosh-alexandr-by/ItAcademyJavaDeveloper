
public class NullsToEnd {

	public static void main(String[] args) {

		int ar[] = new int[10];
		for (int i=0; i<10; i++) {
			ar[i] = (int)((Math.random()*5));
		}
		
		System.out.print("Массив случайных чисел от 0 до 5: ");
		for (int i=0; i<10; i++) {
			if (i==9) {
				System.out.println(ar[i] + "."); break;
			}
			System.out.print(ar[i] + ", ");
		}
		
		
		int nov[] = new int[10];
		System.out.print("Новый массив:                     ");
		

		int k = 0;
		for (int i=0; i<10; i++) {
			if (ar[i]==0) continue;
			nov[k] = ar[i];
			k = k+1;
		}
		for (int i=0; i<10; i++) {
			if (i==9) {
				System.out.println(nov[i] + "."); break;
			}
			System.out.print(nov[i] + ", ");
		}


	}

}
