/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Error;
import java.awt.AWTError;

public class AWTErrorExample {
    public static void main(String[] args) {
        try {
            // Simular una situación que puede lanzar un AWTError
            throw new AWTError("Error en el sistema AWT");
        } catch (AWTError e) {
            System.out.println("Se ha producido un AWTError: " + e.getMessage());
        }
    }
}
