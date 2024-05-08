/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Exceptions;
public class RuntimeExceptionExample {
    public static void main(String[] args) {
        try {
            // Simular una situación que lanza una RuntimeException
            int result = divide(10, 0);
            System.out.println("Resultado: " + result);
        } catch (RuntimeException e) {
            System.out.println("Se ha producido una RuntimeException: " + e.getMessage());
        }
    }

    public static int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("División por cero");
        }
        return a / b;
    }
}