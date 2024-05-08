/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Exceptions;

/**
 *
 * @author HP
 */
public class ClassNotFoundExceptionExample {
    public static void main(String[] args) {
        try {
            // Intentar cargar una clase que no existe
            Class.forName("com.example.NonExistentClass");
        } catch (ClassNotFoundException e) {
            System.out.println("Se ha producido una ClassNotFoundException: " + e.getMessage());
        }
    }
}
