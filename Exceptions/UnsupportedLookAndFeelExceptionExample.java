/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Exceptions;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class UnsupportedLookAndFeelExceptionExample {
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel("com.example.unsupported.LookAndFeel");
        } catch (UnsupportedLookAndFeelException e) {
            System.out.println("Se ha producido una UnsupportedLookAndFeelException: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println("Se ha producido un ClassNotFoundException: " + e.getMessage());
        } catch (InstantiationException e) {
            System.out.println("Se ha producido un InstantiationException: " + e.getMessage());
        } catch (IllegalAccessException e) {
            System.out.println("Se ha producido un IllegalAccessException: " + e.getMessage());
        }
    }
}
