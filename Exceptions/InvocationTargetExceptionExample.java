/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Exceptions;
import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;

public class InvocationTargetExceptionExample {
    public static void main(String[] args) {
        try {
            
            Method method = Calculator.class.getMethod("divide", int.class, int.class);

           
            method.invoke(new Calculator(), 10, 0);
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            if (e instanceof InvocationTargetException) {
                Throwable targetException = ((InvocationTargetException) e).getTargetException();
                System.out.println("Se ha producido una InvocationTargetException: " + targetException.getMessage());
            } else {
                System.out.println("Ocurrió un error: " + e.getMessage());
            }
        }
    }

    static class Calculator {
        public void divide(int a, int b) {
            System.out.println("Resultado de la división: " + (a / b));
        }
    }
}
