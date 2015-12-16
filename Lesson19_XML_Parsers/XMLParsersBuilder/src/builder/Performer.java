/** "Director" */

package builder;

public class Performer {

	private ParserBuilder parserBuilder;
	
	public void setParserBuilder(ParserBuilder pb) {
		parserBuilder = pb;
	}
	public Parser getParser() {
		return parserBuilder.getParser();
	}
	
	public void constructParser() {
		parserBuilder.createNewParser();
		parserBuilder.buildParser();
	}
	
}
