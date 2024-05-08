/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Exceptions;
import java.util.concurrent.TimeoutException;

public class TimeoutExceptionExample {
    public static void main(String[] args) {
        try {
            // Simular una operación que excede el tiempo de espera
            performOperation();
        } catch (TimeoutException e) {
            System.out.println("Se ha producido una TimeoutException: " + e.getMessage());
        }
    }

    private static void performOperation() throws TimeoutException {
        // Simular una operación que tarda demasiado tiempo
        try {
            Thread.sleep(5000); // Esperar 5 segundos
        } catch (InterruptedException e) {
            // Ignorar la excepción
        }

        // Lanzar una TimeoutException si la operación tarda demasiado
        throw new TimeoutException("La operación excedió el tiempo de espera");
    }
}
