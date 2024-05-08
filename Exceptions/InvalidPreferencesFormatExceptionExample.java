/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Exceptions;
import java.io.IOException;
import java.util.prefs.InvalidPreferencesFormatException;
import java.util.prefs.Preferences;

public class InvalidPreferencesFormatExceptionExample {
    public static void main(String[] args) {
        try {
            // Intentar cargar preferencias desde un archivo XML con un formato incorrecto
            Preferences.importPreferences(new java.io.FileInputStream("invalidPreferences.xml"));
        } catch (InvalidPreferencesFormatException e) {
            System.out.println("Se ha producido una InvalidPreferencesFormatException: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Ocurrió un error: " + e.getMessage());
        }
    }
}
