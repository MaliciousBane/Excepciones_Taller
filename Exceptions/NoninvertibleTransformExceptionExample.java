/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Exceptions;
import java.awt.geom.AffineTransform;
import java.awt.geom.NoninvertibleTransformException;

public class NoninvertibleTransformExceptionExample {
    public static void main(String[] args) {
        try {
            
            AffineTransform transform = new AffineTransform();
            transform.translate(10, 10);
            transform.scale(0, 1); 

           
            AffineTransform inverseTransform = transform.createInverse();
            System.out.println("Transformación inversa: " + inverseTransform);
        } catch (NoninvertibleTransformException e) {
            System.out.println("Se ha producido una NoninvertibleTransformException: " + e.getMessage());
        }
    }
}
