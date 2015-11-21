package xml;

import java.io.File;

import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

public class Transform {

	public static void main(String[] args) {
		
		File XSLTransform = new File("transform.xsl");
		StreamSource styleSource = new StreamSource(XSLTransform);
		try {
		TransformerFactory tf = TransformerFactory.newInstance();
		// установка используемого XSL-преобразования
		Transformer transformer = tf.newTransformer(styleSource);
		// установка исходного XML-документа и конечного XML-файла
			transformer.transform(new StreamSource("studentList.xml"),	new StreamResult("new_studentList.html"));
		} catch (TransformerConfigurationException e) {
			e.printStackTrace();
		} catch (TransformerException e) {
			e.printStackTrace();
		}	
		
		System.out.println("Transform " + " complete");

	}

}
