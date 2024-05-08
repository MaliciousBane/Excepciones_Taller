/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Exceptions;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

public class DatatypeConfigurationExceptionExample {
    public static void main(String[] args) {
        try {
           
            DatatypeFactory factory = DatatypeFactory.newInstance();

            
            XMLGregorianCalendar calendar = factory.newXMLGregorianCalendar("2022-02-30"); // Fecha inválida
        } catch (DatatypeConfigurationException e) {
            System.out.println("Se ha producido una DatatypeConfigurationException: " + e.getMessage());
        }
    }
}