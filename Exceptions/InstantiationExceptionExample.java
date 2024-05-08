/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Exceptions;

/**
 *
 * @author HP
 */
public class InstantiationExceptionExample {
    public static void main(String[] args) {
        try {
            
            AbstractClass instance = AbstractClass.class.newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            System.out.println("Se ha producido una " + e.getClass().getSimpleName() + ": " + e.getMessage());
        }
    }

    private static abstract class AbstractClass {
        private AbstractClass() {
            
        }
    }
}
