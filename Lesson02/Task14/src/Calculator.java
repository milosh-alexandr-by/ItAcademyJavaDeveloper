
import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		
		String str;
		
		//  Создаём бесконечный цикл while{}, в котором прописываем условие выхода: строка должна быть равнв "q".
		while (true) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Введите ваше выражение, например \"1+1\": ");
		str = sc.nextLine();
		if (str.equals("q")) {
			System.exit(0);
		};
		
		// В центре выражения должен стоять знак. Найдём его место и узнаем, что это за знак:
		// cоздадим из строки маcсив символов, и перебираем их. Если символ совпадает с + или - или * или /, то запоминаем место символа и сам символ

		int numberOfSign = 0;
		char sign = '0';
		char[] chArray = str.toCharArray();
		for (int i=0; i<str.length(); i++) {
			if ( (chArray[i] == '+') | (chArray[i] == '*') | (chArray[i] == '-') | (chArray[i] == '/') )  {
				numberOfSign = i;
				sign = chArray[i];    //если первым стоит минус, то перебор пойдёт дальше к следующему знаку
				if ( (chArray[i] == '+') | (chArray[i] == '*') | (chArray[i] == '/') ) break;       //   это для того, чтобы не учитывать минус у второго числа      
				
			}
		}
		
		// разобъём строку на две половины: до знака и после знака; и переведём эти половины в тип double
		String firstHalf = str.substring(0, numberOfSign);
		  Double firstCharacter = Double.valueOf(firstHalf);
		  
		String secondHalf = str.substring(numberOfSign+1);
		  Double secondCharacter = Double.valueOf(secondHalf);

		// в зависимости от знака, который мы уже знаем, выполняем соостветствующие операции
		switch (sign) {
		case '+': System.out.println(firstCharacter+secondCharacter); break;
		case '-': System.out.println(firstCharacter-secondCharacter); break;
		case '*': System.out.println(firstCharacter*secondCharacter); break;
		case '/': System.out.printf("%.2f%n", firstCharacter/secondCharacter); break;
		}
		System.out.println("Для выхода нажмите \"q\".");
		
		}
	
	
		
	}

}
