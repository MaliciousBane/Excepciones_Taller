/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Error;
import java.io.IOError;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class IOErrorExample {
    public static void main(String[] args) {
        try {
            readFileContents("non-existent-file.txt");
        } catch (IOError e) {
            System.out.println("Se ha producido un IOError: " + e.getMessage());
        }
    }

    private static void readFileContents(String fileName) throws IOError {
        try {
            byte[] fileContents = Files.readAllBytes(Paths.get(fileName));
            System.out.println("Contenido del archivo: " + new String(fileContents));
        } catch (IOException e) {
            throw new IOError("Error al leer el archivo: " + fileName);
        }
    }
}
