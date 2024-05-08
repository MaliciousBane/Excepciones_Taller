/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Exceptions;
public class URIReferenceExceptionExample {
    public static void main(String[] args) {
        try {
            // Simular una situación que puede lanzar una URIReferenceException
            throw new URIReferenceException("Error al procesar la referencia URI");
        } catch (URIReferenceException e) {
            System.out.println("Se ha producido una URIReferenceException: " + e.getMessage());
        }
    }
}
