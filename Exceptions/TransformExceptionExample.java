/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Exceptions;
import javax.xml.crypto.dsig.TransformException;

public class TransformExceptionExample {
    public static void main(String[] args) {
        try {
            // Simular una situación que puede lanzar una TransformException
            throw new TransformException("Error al ejecutar el algoritmo de transformación");
        } catch (TransformException e) {
            System.out.println("Se ha producido una TransformException: " + e.getMessage());
        }
    }
}
