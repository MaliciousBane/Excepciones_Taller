/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Exceptions;
import java.util.prefs.BackingStoreException;
import java.util.prefs.Preferences;

public class BackingStoreExceptionExample {
    public static void main(String[] args) {
        try {
           
            Preferences prefs = Preferences.userNodeForPackage(BackingStoreExceptionExample.class);

          
            prefs.clear();
            prefs.flush(); 
        } catch (BackingStoreException e) {
            System.out.println("Se ha producido una BackingStoreException: " + e.getMessage());
        }
    }
}
