/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Exceptions;
public class UnmodifiableClassExceptionExample {
    public static void main(String[] args) {
        try {
            // Simular una situación que puede lanzar una UnmodifiableClassException
            modifyUnmodifiableClass();
        } catch (UnmodifiableClassException e) {
            System.out.println("Se ha producido una UnmodifiableClassException: " + e.getMessage());
        }
    }

    private static void modifyUnmodifiableClass() throws UnmodifiableClassException {
        // Simular un intento de modificar una clase inmutable
        throw new UnmodifiableClassException("No se puede modificar la clase");
    }
}