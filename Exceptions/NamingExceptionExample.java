/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Exceptions;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

public class NamingExceptionExample {
    public static void main(String[] args) {
        try {
            // Crear un contexto JNDI inicial
            Context initialContext = new InitialContext();

            // Buscar un objeto en el contexto JNDI (simulando un error)
            Object object = initialContext.lookup("invalid/name");
            System.out.println("Objeto encontrado: " + object);
        } catch (NamingException e) {
            System.out.println("Se ha producido una NamingException: " + e.getMessage());
        }
    }
}
