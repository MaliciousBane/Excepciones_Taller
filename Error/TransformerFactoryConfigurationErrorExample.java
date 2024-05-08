/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Error;
import javax.xml.transform.TransformerFactoryConfigurationError;

public class TransformerFactoryConfigurationErrorExample {
    public static void main(String[] args) {
        try {
            createTransformerFactory();
        } catch (TransformerFactoryConfigurationError e) {
            System.out.println("Se ha producido un TransformerFactoryConfigurationError: " + e.getMessage());
        }
    }

    private static void createTransformerFactory() throws TransformerFactoryConfigurationError {
        System.setProperty("javax.xml.transform.TransformerFactory", "com.example.InvalidTransformerFactory");
        javax.xml.transform.TransformerFactory.newInstance();
    }
}
