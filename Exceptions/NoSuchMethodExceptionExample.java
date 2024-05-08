/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Exceptions;
import java.lang.reflect.Method;

public class NoSuchMethodExceptionExample {
    public static void main(String[] args) {
        try {
            // Obtener la clase de ejemplo
            Class<?> myClass = ExampleClass.class;

            // Intentar acceder a un método que no existe en la clase
            Method method = myClass.getDeclaredMethod("nonExistentMethod");
        } catch (NoSuchMethodException e) {
            System.out.println("Se ha producido una NoSuchMethodException: " + e.getMessage());
        }
    }
}

class ExampleClass {
    public void existingMethod() {
        // Método existente en la clase de ejemplo
    }
}
