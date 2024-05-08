/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package RunTimeException;
import org.w3c.dom.ls.LSException;

public class LSExceptionExample {
    public static void main(String[] args) {
        try {
            throw new LSException((short) 1, "Error en la operación de carga XML");
        } catch (LSException e) {
            System.out.println("Se ha producido una LSException: " + e.getMessage());
        }
    }
}