/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package RunTimeException;
import java.security.ProviderException;

public class ProviderExceptionExample {
    public static void main(String[] args) {
        try {
            throw new ProviderException("Error en el proveedor de seguridad");
        } catch (ProviderException e) {
            System.out.println("Se ha producido una ProviderException: " + e.getMessage());
        }
    }
}
