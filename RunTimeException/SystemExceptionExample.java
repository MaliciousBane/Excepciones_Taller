/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package RunTimeException;
public class SystemExceptionExample {
    public static void main(String[] args) {
        try {
            throw new SystemException("Error del sistema");
        } catch (SystemException e) {
            System.out.println("Se ha producido una SystemException: " + e.getMessage());
        }
    }
}
