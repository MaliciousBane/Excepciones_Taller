/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Exceptions;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class IOExceptionExample {
    public static void main(String[] args) {
        try {
            File file = new File("output.txt");
            FileWriter writer = new FileWriter(file);
            writer.write("Escribiendo en el archivo...");
            writer.close();
            System.out.println("Archivo creado exitosamente.");
        } catch (IOException e) {
            System.out.println("Se ha producido una IOException: " + e.getMessage());
        }
    }
}
