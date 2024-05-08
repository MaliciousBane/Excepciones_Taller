/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Error;
public class AssertionErrorExample {
    public static void main(String[] args) {
        try {
            // Simular una situación que puede lanzar una AssertionError
            int result = divideNumbers(10, 0);
            assert result >= 0 : "El resultado no puede ser negativo";
        } catch (AssertionError e) {
            System.out.println("Se ha producido una AssertionError: " + e.getMessage());
        }
    }

    private static int divideNumbers(int dividend, int divisor) {
        return dividend / divisor;
    }
}
