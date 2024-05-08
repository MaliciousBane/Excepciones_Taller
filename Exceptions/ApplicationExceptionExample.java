/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Exceptions;

/**
 *
 * @author HP
 */
public class ApplicationExceptionExample {

    public static void main(String[] args) {
        try {
            throw new ApplicationException("Se ha producido un error en la aplicación.");
        } catch (ApplicationException e) {
            System.out.println("Excepción capturada: " + e.getMessage());
        }
    }
}

