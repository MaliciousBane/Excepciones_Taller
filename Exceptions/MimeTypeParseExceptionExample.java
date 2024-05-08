/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Exceptions;
import java.awt.datatransfer.MimeTypeParseException;

public class MimeTypeParseExceptionExample {
    public static void main(String[] args) {
        try {
            throw new MimeTypeParseException("Error al analizar el tipo MIME");
        } catch (MimeTypeParseException e) {
            System.out.println("Se ha producido una MimeTypeParseException: " + e.getMessage());
        }
    }
}
