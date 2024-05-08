/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Exceptions;
public class RemarshalExceptionExample {
    public static void main(String[] args) {
        try {
            // Simular una situación que puede lanzar una RemarshalException
            throw new RemarshalException("Error al intentar remarshalizar los datos");
        } catch (RemarshalException e) {
            System.out.println("Se ha producido una RemarshalException: " + e.getMessage());
        }
    }
}
