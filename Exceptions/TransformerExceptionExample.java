/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Exceptions;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamSource;
import javax.xml.transform.stream.StreamResult;

public class TransformerExceptionExample {
    public static void main(String[] args) {
        try {
            // Crear un Transformer con una configuración inválida
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();

            // Intentar transformar un documento con una fuente inválida
            transformer.transform(new StreamSource("invalid_source.xml"), new StreamResult("output.xml"));
        } catch (TransformerException e) {
            System.out.println("Se ha producido una TransformerException: " + e.getMessage());
        }
    }
}