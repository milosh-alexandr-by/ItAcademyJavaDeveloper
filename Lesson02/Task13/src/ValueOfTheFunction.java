
public class ValueOfTheFunction {

	public static void main(String[] args) {
		
		System.out.println("Вывести на экран значения функции у = 2х^2­5х­8 в диапазоне от ­4 до 4. Шаг изменения аргумента 0,5.");
		double x = 0;
		double y = 0;
		for ( x=-4; x<=4; x=x+0.5  ) {
			y = Math.pow(x, 2) - 5*x - 8;
			if (x<0) {
				System.out.println("x = " + x + "  " + "y = " + y);     // чтобы выровнять игреки
			}
			else {
				System.out.println("x = " + x + "  " + " y = " + y);
			}
			
		}

	}

}
