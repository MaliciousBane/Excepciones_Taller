/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Exceptions;
import org.ietf.jgss.GSSException;

public class GSSExceptionExample {
    public static void main(String[] args) {
        try {
            // Simular una excepción GSS al realizar una operación de seguridad
            throw new GSSException(GSSException.FAILURE, 1, "Error en la operación GSS");
        } catch (GSSException e) {
            System.out.println("Se ha producido una GSSException: " + e.getMessage());
            System.out.println("Código de error: " + e.getMajor());
        }
    }
}
