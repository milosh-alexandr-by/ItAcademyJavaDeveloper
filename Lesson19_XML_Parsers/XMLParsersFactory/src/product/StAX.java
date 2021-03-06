package product;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;

public class StAX implements Parser {

	@Override
	public void performParser() {
		
		System.out.println("-------------- StAX Parser - Start ---------------");
		
		boolean isStudent = false;
		boolean isFirstName = false;
		boolean isLastName = false;
		boolean isAge = false;
		boolean isFaculty = false;
		boolean isStudentList = false;
		
		XMLInputFactory factory = XMLInputFactory.newFactory();
		try {
			XMLStreamReader reader = factory.createXMLStreamReader(new FileInputStream("StudentList.xml"));
			while (reader.hasNext()) {
				int res = reader.next();
				if (res == reader.START_ELEMENT) {
					if (reader.getLocalName().equals("studentList")) {
						isStudentList = true;
						System.out.print(reader.getLocalName() + ": ");
						System.out.print("(");
						for (int i=0; i<reader.getAttributeCount(); i++) {
							System.out.print(reader.getAttributeLocalName(i) + "=" + reader.getAttributeValue(i) + " ");
						}
						System.out.println(")");
					} else if (reader.getLocalName().equals("student")) {
						isStudent = true;
						System.out.print(reader.getLocalName() + ": ");
						for (int i=0; i<reader.getAttributeCount(); i++) {
							System.out.print("(" + reader.getAttributeLocalName(i) + "=" + reader.getAttributeValue(i) + ")\n");
						}
					} else if (reader.getLocalName().equals("firstName")) {
						isFirstName = true;
					} else if (reader.getLocalName().equals("lastName")) {
						isLastName = true;
					} else if (reader.getLocalName().equals("age")) {
						isAge = true;
					} else if (reader.getLocalName().equals("faculty")) {
						isFaculty = true;
					}
				} else if (res == reader.CHARACTERS) {
					if (isFirstName) {
						System.out.println("    " + "firstName: " + reader.getText());
						isFirstName = false;
					} else if (isLastName) {
						System.out.println("    " + "lastName: " + reader.getText());
						isLastName = false;
					} else if (isAge) {
						System.out.println("    " + "age: " + reader.getText());
						isAge = false;
					} else if (isFaculty) {
						System.out.println("    " + "faculty: " + reader.getText());
						isFaculty = false;
					}
				} 
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (XMLStreamException e) {
			e.printStackTrace();
		}
		
		System.out.println("--------------- StAX Parser - End ---------------");
		
	}

}
