/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Exceptions;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.IOException;
import org.xml.sax.helpers.DefaultHandler;

public class XMLParseExceptionExample {
    public static void main(String[] args) {
        try {
            parseXMLDocument("invalid_xml.xml");
        } catch (SAXParseException e) {
            System.out.println("Se ha producido una XMLParseException: " + e.getMessage());
            System.out.println("Línea: " + e.getLineNumber() + ", Columna: " + e.getColumnNumber());
        } catch (SAXException e) {
            System.out.println("Se ha producido una SAXException: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Se ha producido un IOException: " + e.getMessage());
        } catch (ParserConfigurationException e) {
            System.out.println("Se ha producido un ParserConfigurationException: " + e.getMessage());
        }
    }

    private static void parseXMLDocument(String fileName) throws SAXException, IOException, ParserConfigurationException {
        SAXParserFactory factory = SAXParserFactory.newInstance();
        SAXParser parser = factory.newSAXParser();
        parser.parse(fileName, new DefaultHandler());
    }
}
