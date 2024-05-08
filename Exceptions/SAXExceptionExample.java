/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Exceptions;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.IOException;

public class SAXExceptionExample {
    public static void main(String[] args) {
        try {
            // Crear un analizador SAX
            SAXParserFactory factory = SAXParserFactory.newInstance();
            SAXParser parser = factory.newSAXParser();

            // Intentar analizar un documento XML con un error
            parser.parse("invalid_xml.xml", new DefaultHandler());
        } catch (SAXException e) {
            System.out.println("Se ha producido una SAXException: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Se ha producido un IOException: " + e.getMessage());
        } catch (ParserConfigurationException e) {
            System.out.println("Se ha producido un ParserConfigurationException: " + e.getMessage());
        }
    }
}
