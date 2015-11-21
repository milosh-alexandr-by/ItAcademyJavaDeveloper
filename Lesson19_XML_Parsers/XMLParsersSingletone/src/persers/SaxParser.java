package persers;

import java.io.IOException;

import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.XMLReaderFactory;

public class SaxParser {

	public static void performSaxParser() {
		
		try {
			XMLReader reader = XMLReaderFactory.createXMLReader();
			Sax handler = new Sax();
			reader.setContentHandler(handler);
			reader.parse("StudentList.xml");
		} catch (SAXException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
}
