/** "Abstract Builder" */

package builder;

public abstract class ParserBuilder {

	protected Parser parser;
	
	public Parser getParser() {
		return parser;
	}
	public void createNewParser() {
		parser = new Parser();
	}
	
	public abstract void buildParser();
	
}
