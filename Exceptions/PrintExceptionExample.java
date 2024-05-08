/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Exceptions;

/**
 *
 * @author HP
 */
public class PrintExceptionExample {
    public static void main(String[] args) {
        try {
            // Simular una situación que puede lanzar una PrintException
            throw new PrintException("Error al imprimir el documento");
        } catch (PrintException e) {
            System.out.println("Se ha producido una PrintException: " + e.getMessage());
        }
    }
}
