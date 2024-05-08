/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package RunTimeException;
public class TypeConstraintException extends Exception {
    public TypeConstraintException(String message) {
        super(message);
    }

    public static void validateType(int value) throws TypeConstraintException {
        if (value < 0) {
            throw new TypeConstraintException("El valor debe ser mayor o igual a cero");
        } else {
            System.out.println("Valor válido: " + value);
        }
    }

    public static void main(String[] args) {
        try {
            validateType(-5); // Simular un valor que incumple la restricción de tipo
        } catch (TypeConstraintException e) {
            System.out.println("Se ha producido una TypeConstraintException: " + e.getMessage());
        }
    }
}
