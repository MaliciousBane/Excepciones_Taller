/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Exceptions;

public class MarshalExceptionExample {
    public static void main(String[] args) {
        try {
            throw new JAXBException("Error en la operación de marshalling");
        } catch (JAXBException e) {
            System.out.println("Se ha producido un MarshalException: " + e.getMessage());
        }
    }
}
