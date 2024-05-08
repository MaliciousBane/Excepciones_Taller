/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Exceptions;
import javax.xml.bind.JAXBException;

public class JAXBExceptionExample {
    public static void main(String[] args) {
        try {
            throw new JAXBException("Error en la operación de JAXB");
        } catch (JAXBException e) {
            System.out.println("Se ha producido un JAXBException: " + e.getMessage());
        }
    }
}
