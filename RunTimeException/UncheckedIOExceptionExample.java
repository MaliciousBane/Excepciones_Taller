/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package RunTimeException;

import java.io.IOException;
import java.io.UncheckedIOException;

public class UncheckedIOExceptionExample {
    public static void processFile(String filePath) {
        try {
            throw new IOException("Error al procesar el archivo");
        } catch (IOException e) {
            throw new UncheckedIOException("Error al procesar el archivo: " + filePath, e);
        }
    }

    public static void main(String[] args) {
        try {
            processFile("example.txt");
        } catch (UncheckedIOException e) {
            System.out.println("Se ha producido una UncheckedIOException: " + e.getMessage());
            e.getCause().printStackTrace();
        }
    }
}
