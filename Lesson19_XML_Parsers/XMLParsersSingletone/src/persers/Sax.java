package persers;

import org.xml.sax.Attributes;
import org.xml.sax.helpers.DefaultHandler;

public class Sax extends DefaultHandler {
	
	@Override
	public void startDocument() {
		System.out.println("-------------- SAX Parser - Start ---------------");
	}
	
	@Override
	public void startElement(String uri, String localName, String qName, Attributes attributes) {
		String s = localName;
		for (int i = 0; i < attributes.getLength(); i++) {
			s += " " + attributes.getLocalName(i) + "=" + attributes.getValue(i);
		}
		System.out.print(s.trim());
	}
	
	@Override
	public void characters(char[] ch, int start, int length) {
		System.out.print(" " + new String(ch, start, length) + " ");
	}

	@Override
	public void endElement(String uri, String localName, String qName) {
		System.out.print(localName);
	}

	@Override
	public void endDocument() {
		System.out.println("\n--------------- SAX Parser - End -----------------\n");
	}

}
