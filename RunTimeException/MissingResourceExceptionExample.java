/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package RunTimeException;
import java.util.MissingResourceException;
import java.util.ResourceBundle;

public class MissingResourceExceptionExample {
    public static void main(String[] args) {
        try {
            ResourceBundle bundle = ResourceBundle.getBundle("messages");
            String greeting = bundle.getString("greeting");
            System.out.println("Mensaje de saludo: " + greeting);
        } catch (MissingResourceException e) {
            System.out.println("Se ha producido una MissingResourceException: " + e.getMessage());
        }
    }
}
