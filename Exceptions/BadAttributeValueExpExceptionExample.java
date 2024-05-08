/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Exceptions;
import javax.management.BadAttributeValueExpException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

public class BadAttributeValueExpExceptionExample {
    public static void main(String[] args) {
        try {
            // Crear un objeto XPath
            XPathFactory factory = XPathFactory.newInstance();
            XPath xpath = factory.newXPath();

            // Crear una expresión XPath
            XPathExpression expr = xpath.compile("//element[@attribute='value']");

            // Intentar evaluar la expresión XPath
            expr.evaluate("xml-document.xml"); // Esto lanzará la excepción
        } catch (XPathExpressionException e) {
            if (e instanceof BadAttributeValueExpException) {
                System.out.println("Se ha producido una BadAttributeValueExpException: " + e.getMessage());
            } else {
                System.out.println("Error al evaluar la expresión XPath: " + e.getMessage());
            }
        }
    }
}