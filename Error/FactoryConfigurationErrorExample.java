/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Error;
import javax.xml.parsers.FactoryConfigurationError;

public class FactoryConfigurationErrorExample {
    public static void main(String[] args) {
        try {
            // Simular una situación que puede lanzar un FactoryConfigurationError
            createXMLParserFactory();
        } catch (FactoryConfigurationError e) {
            System.out.println("Se ha producido un FactoryConfigurationError: " + e.getMessage());
        }
    }

    private static void createXMLParserFactory() throws FactoryConfigurationError {
        // Simular un error de configuración en la fábrica de parsers XML
        System.setProperty("javax.xml.parsers.DocumentBuilderFactory", "com.example.InvalidParserFactory");
        javax.xml.parsers.DocumentBuilderFactory.newInstance();
    }
}
