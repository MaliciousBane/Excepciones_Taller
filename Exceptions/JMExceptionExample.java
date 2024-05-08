/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Exceptions;

/**
 *
 * @author HP
 */
public class JMExceptionExample {
    public static void main(String[] args) {
        try {
            // Simular una operación que puede lanzar una JMException
            performOperation(10, 0);
        } catch (JMException e) {
            System.out.println("Se ha producido una JMException: " + e.getMessage());
        }
    }

    public static void performOperation(int a, int b) throws JMException {
        if (b == 0) {
            throw new JMException("División por cero");
        } else {
            int result = a / b;
            System.out.println("Resultado: " + result);
        }
    }
}
