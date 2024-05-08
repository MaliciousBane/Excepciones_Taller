/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package RunTimeException;
public class IllegalArgumentExceptionExample {
    public static void main(String[] args) {
        try {
            int age = -5;
            if (age < 0) {
                throw new IllegalArgumentException("La edad no puede ser un número negativo");
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Se ha producido una IllegalArgumentException: " + e.getMessage());
        }
    }
}
