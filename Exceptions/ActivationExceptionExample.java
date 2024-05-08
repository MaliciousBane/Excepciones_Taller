/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Exceptions;


public class ActivationExceptionExample {
    public static void main(String[] args) {
        try {
            throw new ActivationException("Se ha producido un error de activación.");
        } catch (ActivationException e) {
            System.out.println("Excepción capturada: " + e.getMessage());
        }
    }
}