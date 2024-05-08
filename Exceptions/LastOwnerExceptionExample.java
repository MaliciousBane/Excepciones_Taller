/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Exceptions;

/**
 *
 * @author HP
 */
public class LastOwnerExceptionExample {
    public static void main(String[] args) {
        try {
            throw new LastOwnerException("Error al determinar el último propietario");
        } catch (LastOwnerException e) {
            System.out.println("Se ha producido una LastOwnerException: " + e.getMessage());
        }
    }
}
