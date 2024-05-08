/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Exceptions;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamReader;
import java.io.StringReader;

public class XMLStreamExceptionExample {
    public static void main(String[] args) {
        try {
            parseXML("<root><element>Contenido</element></root>");
        } catch (XMLStreamException e) {
            System.out.println("Se ha producido una XMLStreamException: " + e.getMessage());
        }
    }

    private static void parseXML(String xml) throws XMLStreamException {
        XMLInputFactory factory = XMLInputFactory.newInstance();
        XMLStreamReader reader = factory.createXMLStreamReader(new StringReader(xml));

        while (reader.hasNext()) {
            reader.next();
        }
    }
}
