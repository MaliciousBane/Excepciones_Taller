/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package RunTimeException;
import java.security.AccessControlException;
import java.security.AccessController;
import java.security.PrivilegedAction;

public class SecurityExceptionExample {
    public static void main(String[] args) {
        try {
            AccessController.doPrivileged((PrivilegedAction<Void>) () -> {
                System.out.println("Realizando operación privilegiada");
                return null;
            });
        } catch (AccessControlException e) {
            System.out.println("Se ha producido una SecurityException: " + e.getMessage());
        }
    }
}
