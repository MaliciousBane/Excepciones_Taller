/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package RunTimeException;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.FileSystemAlreadyExistsException;

public class FileSystemAlreadyExistsExceptionExample {
    public static void main(String[] args) {
        try {
            FileSystem fileSystem = FileSystems.getDefault();
            FileSystem newFileSystem = FileSystems.newFileSystem(fileSystem.getPath("/"), fileSystem.getClass().getClassLoader());
        } catch (FileSystemAlreadyExistsException e) {
            System.out.println("Se ha producido una FileSystemAlreadyExistsException: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error al crear el sistema de archivos: " + e.getMessage());
        }
    }
}
