package single;

import persers.DomParser;
import persers.SaxParser;
import persers.StaxParser;

public class SingletoneParsers {
	
	private static SingletoneParsers instance;
	
	private SingletoneParsers() {
		
	}
	
	public static synchronized SingletoneParsers getInstance(){
		if (instance == null) {
			instance = new SingletoneParsers();
		}
		return instance;
	}
	
	public void performParsers() {
		DomParser.performDomParser();
		SaxParser.performSaxParser();
		StaxParser.performStaxParser();
	}

}
