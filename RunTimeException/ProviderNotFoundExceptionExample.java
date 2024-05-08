/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package RunTimeException;
import java.nio.file.ProviderNotFoundException;
import java.security.Provider;
import java.security.Security;

public class ProviderNotFoundExceptionExample {
    public static void main(String[] args) {
        try {

            Provider provider = Security.getProvider("NonExistentProvider");
            System.out.println("Proveedor encontrado: " + provider.getName());
        } catch (ProviderNotFoundException e) {
            System.out.println("Se ha producido una ProviderNotFoundException: " + e.getMessage());
        }
    }
}
