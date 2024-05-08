/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Error;
import java.lang.annotation.AnnotationFormatError;

public class AnnotationFormatErrorExample {
    public static void main(String[] args) {
        try {
            throw new AnnotationFormatError("Error en el formato de la anotación");
        } catch (AnnotationFormatError e) {
            System.out.println("Se ha producido una AnnotationFormatError: " + e.getMessage());
        }
    }
}
