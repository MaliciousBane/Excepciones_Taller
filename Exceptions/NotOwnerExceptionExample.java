/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Exceptions;

/**
 *
 * @author HP
 */

public class NotOwnerExceptionExample {
    public static void main(String[] args) {
        try {
            // Simular una situación que puede lanzar una NotOwnerException
            throw new NotOwnerException("El usuario no es el propietario");
        } catch (NotOwnerException e) {
            System.out.println("Se ha producido una NotOwnerException: " + e.getMessage());
        }
    }
}

