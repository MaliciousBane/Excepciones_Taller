/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Exceptions;
import java.lang.reflect.Method;

public class IllegalAccessExceptionExample {
    public static void main(String[] args) {
        try {
            
            Method method = SomeClass.class.getDeclaredMethod("privateMethod");
            method.setAccessible(true); 
            method.invoke(new SomeClass());
        } catch (IllegalAccessException e) {
            System.out.println("Se ha producido una IllegalAccessException: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Ocurrió un error: " + e.getMessage());
        }
    }

    static class SomeClass {
        private void privateMethod() {
            System.out.println("Método privado invocado");
        }
    }
}
