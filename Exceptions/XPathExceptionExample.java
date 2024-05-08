/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Exceptions;
import javax.xml.xpath.XPathExpressionException;

public class XPathExceptionExample {
    public static void main(String[] args) {
        try {
            throw new XPathExpressionException("Error al evaluar la expresión XPath");
        } catch (XPathExpressionException e) {
            System.out.println("Se ha producido una XPathExpressionException: " + e.getMessage());
        }
    }
}
