
import java.util.Scanner;

public class ChangeCharacter {

	public static void main(String[] args) {
		
		// введём текст с клавиатуры
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter tour text: ");
		String text = sc.nextLine();

		// введём номер символа, который мы хотим заменить
		System.out.print("Введите номер символа, который вы хотите заменить: ");
		int n = sc.nextInt();

		// введём букву для замены
		System.out.print("Введите букву для замены: ");
		Scanner sc2 = new Scanner(System.in);
		String str0 = sc2.nextLine();
		char ch = str0.charAt(0);        // преобразуем введённую строку в символ char
		
		// так как мы указываем номер символа в человеческом представлении,
		// а в компьютерном представлении массив начинается с нуля
		// то мы будем заменять 3-й символ (n=3), который соответсвует 2-му элементу массива M[n-1]=M[K]=M[2] 
		int k = n-1; 
		// создадим перемнную p, чтобы учесть, если слово заканчивается на знак препинания
		int p = n-1;
		char symbol = ch;
		
		// разделим нашу строку на слова, разделённые пробелом
		// создадим масиив str этих слов
		String[] str = text.split(" ");
		
		for (int i=0; i<str.length; i++){
			// каждое слово (каждый элемент массива str) разобъём на массив элементов char (то есть на буквы, из которого состоит слово)  
			char[] arr = str[i].toCharArray();
			// если слово оканчивается на : , ! . ? ; то мы не будем учитывать эти знаки
			// тоесть если мы укажем n=7, то в слове "Привет!" восклицательный знак менять не будем
			if (str[i].endsWith(":")|str[i].endsWith(",")|str[i].endsWith("!")|str[i].endsWith("\\.")|str[i].endsWith("?")|str[i].endsWith(";")) {
				p = n;  
			}
			if (arr.length>p) {
				for (int j=0; j<arr.length; j++){
					arr[k] = symbol;
					System.out.print(arr[j]);
				}
			}
			else {
				System.out.print(str[i]);
			}
			System.out.print(" ");	
		}
		}
		
}