/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Exceptions;

public class SOAPExceptionExample {
    public static void main(String[] args) {
        try {
            // Simular un error al procesar un mensaje SOAP
            throw new SOAPException("Error al procesar el mensaje SOAP");
        } catch (SOAPException e) {
            System.out.println("Se ha producido una SOAPException: " + e.getMessage());
        }
    }
}
