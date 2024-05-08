/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package RunTimeException;
import java.util.Locale;
import java.util.IllformedLocaleException;

public class IllformedLocaleExceptionExample {
    public static void main(String[] args) {
        try {
            Locale invalidLocale = Locale.forLanguageTag("es-MX-invalid");
            System.out.println("Locale creada: " + invalidLocale);
        } catch (IllformedLocaleException e) {
            System.out.println("Se ha producido una IllformedLocaleException: " + e.getMessage());
        }
    }
}
