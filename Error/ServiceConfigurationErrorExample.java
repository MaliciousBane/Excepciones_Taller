/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Error;
import java.util.ServiceConfigurationError;

public class ServiceConfigurationErrorExample {
    public static void main(String[] args) {
        try {
            // Simular una situación que puede lanzar un ServiceConfigurationError
            loadServiceProvider();
        } catch (ServiceConfigurationError e) {
            System.out.println("Se ha producido un ServiceConfigurationError: " + e.getMessage());
        }
    }

    private static void loadServiceProvider() throws ServiceConfigurationError {
        // Simular la carga de un proveedor de servicio con una configuración incorrecta
        System.setProperty("java.service.provider", "com.example.InvalidServiceProvider");
        java.util.ServiceLoader.load(java.util.function.Function.class);
    }
}
