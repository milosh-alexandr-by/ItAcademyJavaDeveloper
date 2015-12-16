package builder;

public class Main {

	public static void main(String[] args) {
		
		Performer performer = new Performer();
		
//		ParserBuilder domParserBuilder = new DOMParserBuilder();
//		performer.setParserBuilder(domParserBuilder);
				
//		ParserBuilder staxParserBuilder = new StAXParserBuilder();
//		performer.setParserBuilder(staxParserBuilder);
		
//		ParserBuilder saxParserBuilder = new SAXParserBuilder();
//		performer.setParserBuilder(saxParserBuilder);
		
		performer.constructParser();
		Parser parser = performer.getParser();
		
	}

}
