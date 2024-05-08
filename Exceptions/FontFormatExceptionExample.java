/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Exceptions;
import java.awt.Font;
import java.awt.FontFormatException;
import java.io.File;
import java.io.IOException;

public class FontFormatExceptionExample {
    public static void main(String[] args) {
        try {
            // Cargar una fuente personalizada desde un archivo
            Font customFont = Font.createFont(Font.TRUETYPE_FONT, new File("customfont.ttf"));

            // Usar la fuente cargada
            System.out.println("Fuente cargada correctamente: " + customFont.getName());
        } catch (FontFormatException | IOException e) {
            System.out.println("Se ha producido una FontFormatException: " + e.getMessage());
        }
    }
}
