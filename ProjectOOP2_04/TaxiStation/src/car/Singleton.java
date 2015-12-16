/*
 * Создаём синглтон, который обрабатывает события: записывает их в FrrayList.
 * А затем с помощью метода createLoggerText() создаёт логгер (.txt файл с датами и событиями).
 */
package car;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Singleton {
		
	private static Singleton instance;
		
	private Singleton() {
		
	}
	
	public static Singleton getInstance() {
		if (instance == null) {
			instance = new Singleton();
		}
		return instance;
	}
	
	public static void write(String str) {
		LoggerArrayList.str.add(CurrentDate.currentDate() + ": " + str + ".\n");
	}
	
	public static void createLoggerText() throws IOException {
		File logger = new File("Logger.txt");
		logger.createNewFile();
		FileWriter fileWriter = new FileWriter(logger);
		for (int i=0; i < LoggerArrayList.str.size(); i++) {
			fileWriter.write(LoggerArrayList.str.get(i));
		}
		fileWriter.flush();
		fileWriter.close();
	}

}
