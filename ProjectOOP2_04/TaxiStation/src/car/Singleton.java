package car;

import java.util.Date;

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
	
	public static void met(String str) {
		System.out.println(new Date());
		System.out.println(str);
	}

	

}