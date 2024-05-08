/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Exceptions;
public class RefreshFailedExceptionExample {
    public static void main(String[] args) {
        try {
            // Simular una situación que puede lanzar una RefreshFailedException
            throw new RefreshFailedException("Error al intentar refrescar los datos");
        } catch (RefreshFailedException e) {
            System.out.println("Se ha producido una RefreshFailedException: " + e.getMessage());
        }
    }
}
