/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package RunTimeException;
public class NoSuchMechanismExceptionExample {
    public static void main(String[] args) {
        try {
            String mechanism = "invalid";
            if (!mechanism.equals("basic") && !mechanism.equals("digest")) {
                throw new NoSuchMechanismException("El mecanismo de seguridad no está disponible");
            }
        } catch (NoSuchMechanismException e) {
            System.out.println("Se ha producido una NoSuchMechanismException: " + e.getMessage());
        }
    }
}
