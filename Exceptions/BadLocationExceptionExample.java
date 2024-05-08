/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Exceptions;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import javax.swing.text.SimpleAttributeSet;

public class BadLocationExceptionExample {
    public static void main(String[] args) {
        try {
            // Crear un documento de texto simple
            Document doc = new javax.swing.text.PlainDocument();

            // Intentar insertar texto en una posición no válida
            doc.insertString(100, "Este texto no se insertará", new SimpleAttributeSet());
        } catch (BadLocationException e) {
            System.out.println("Se ha producido una BadLocationException: " + e.getMessage());
        }
    }
}