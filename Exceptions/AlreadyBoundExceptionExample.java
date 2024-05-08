/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Exceptions;
import java.nio.channels.AlreadyBoundException;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

public class AlreadyBoundExceptionExample {
    public static void main(String[] args) {
        try {
            // Crear un contexto JNDI inicial
            Context initialContext = new InitialContext();

            // Intentar enlazar un objeto a un nombre que ya está en uso
            initialContext.bind("myObject", new Object());
            initialContext.bind("myObject", new Object()); // Esto lanzará la excepción
        } catch (NamingException e) {
            if (e instanceof AlreadyBoundException) {
                System.out.println("Error: El nombre ya está en uso.");
            } else {
                System.out.println("Error de JNDI: " + e.getMessage());
            }
        }
    }
}