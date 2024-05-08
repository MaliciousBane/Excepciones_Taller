/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Exceptions;
public class ServerNotActiveExceptionExample {
    public static void main(String[] args) {
        try {
            // Simular una situación que puede lanzar una ServerNotActiveException
            throw new ServerNotActiveException("El servidor no está activo");
        } catch (ServerNotActiveException e) {
            System.out.println("Se ha producido una ServerNotActiveException: " + e.getMessage());
        }
    }
}
