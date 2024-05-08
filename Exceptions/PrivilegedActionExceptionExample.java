/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Exceptions;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.security.PrivilegedActionException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PrivilegedActionExceptionExample {
    public static void main(String[] args) {
        // Ejecutar una acción privilegiada que lanza una excepción
        String result = AccessController.doPrivileged((PrivilegedAction<String>) () -> {
            try {
                // Simular una operación que lanza una excepción verificada
                throw new IllegalAccessException("Excepción dentro de la acción privilegiada");
            } catch (Exception e) {
                try {
                    throw new PrivilegedActionException(e);
                } catch (PrivilegedActionException ex) {
                    Logger.getLogger(PrivilegedActionExceptionExample.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            return null;
        });
    }
}
