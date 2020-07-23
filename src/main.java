
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import javax.xml.stream.XMLEventFactory;
import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamWriter;
import javax.xml.stream.events.XMLEvent;


public class main {

    public static void main(String[] args) throws IOException, XMLStreamException {

        XMLOutputFactory factory = XMLOutputFactory.newInstance();
        XMLEventWriter writer = factory.createXMLEventWriter(new FileWriter("C:\\Javalearning\\XMLL\\src\\output.xml"));
        
        XMLEventFactory xmlef = XMLEventFactory.newFactory();
        
        XMLEvent event = xmlef.createStartDocument();
       writer.add(event);
       
       event = xmlef.createStartElement("", "", "books");
       writer.add(event);
       
       event = xmlef.createStartElement("", "", "book");
       writer.add(event);
       
       event = xmlef.createAttribute("id", "01");
       writer.add(event);
       event = xmlef.createAttribute("isbn", "12345");
       writer.add(event);
       
       event = xmlef.createStartElement("", null, "title");
       writer.add(event);
       
       event = xmlef.createCharacters("Choldhood's End");
       writer.add(event);
       
       event = xmlef.createEndElement("", "", "title");
       writer.add(event);
       
       event = xmlef.createStartElement("", "", "author");
       writer.add(event);
       
       event = xmlef.createCharacters("Arthur Clarke");
       writer.add(event);
       
       event = xmlef.createEndElement("", "", "author");
       writer.add(event);
       
       event = xmlef.createEndElement("", "", "book");
       writer.add(event);
       
       event = xmlef.createEndDocument();
       writer.add(event);
       
       writer.flush();
       writer.close();
       
        
    }

}
