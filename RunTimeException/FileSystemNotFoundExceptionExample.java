/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package RunTimeException;
import java.nio.file.FileSystemNotFoundException;

public class FileSystemNotFoundExceptionExample {
    public static void main(String[] args) {
        try {
            throw new FileSystemNotFoundException("Sistema de archivos no encontrado");
        } catch (FileSystemNotFoundException e) {
            System.out.println("Se ha producido una FileSystemNotFoundException: " + e.getMessage());
        }
    }
}
