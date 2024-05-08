/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package RunTimeException;
import java.awt.geom.IllegalPathStateException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class IllegalPathStateExceptionExample {
    public static void main(String[] args) {
        try {
            Path path = Paths.get("C:\\invalid\\path\\");
            path.toRealPath(); 
        } catch (IllegalPathStateException e) {
            System.out.println("Se ha producido una IllegalPathStateException: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error al procesar la ruta: " + e.getMessage());
        }
    }
}
