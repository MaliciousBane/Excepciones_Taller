/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package RunTimeException;
import javax.management.JMRuntimeException;

public class JMRuntimeExceptionExample {
    public static void main(String[] args) {
        try {
            throw new JMRuntimeException("Error en la operación de gestión");
        } catch (JMRuntimeException e) {
            System.out.println("Se ha producido una JMRuntimeException: " + e.getMessage());
        }
    }
}
