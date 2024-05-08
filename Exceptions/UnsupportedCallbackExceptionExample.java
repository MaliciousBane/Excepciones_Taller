/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Exceptions;
import javax.security.auth.callback.Callback;
import javax.security.auth.callback.UnsupportedCallbackException;

public class UnsupportedCallbackExceptionExample {
    public static void main(String[] args) {
        try {
            // Simular una situación que puede lanzar una UnsupportedCallbackException
            handleCallback(new Callback() {
            });
        } catch (UnsupportedCallbackException e) {
            System.out.println("Se ha producido una UnsupportedCallbackException: " + e.getMessage());
        }
    }

    private static void handleCallback(Callback callback) throws UnsupportedCallbackException {
        // Simular el manejo de un tipo de callback no soportado
        throw new UnsupportedCallbackException(callback, "Tipo de callback no soportado");
    }
}
