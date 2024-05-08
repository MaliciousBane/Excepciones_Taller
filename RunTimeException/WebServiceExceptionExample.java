/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package RunTimeException;
public class WebServiceExceptionExample extends Exception {
    public WebServiceExceptionExample(String message) {
        super(message);
    }

    public static void callWebService() throws WebServiceExceptionExample {
        throw new WebServiceExceptionExample("Error al llamar al servicio web");
    }

    public static void main(String[] args) {
        try {
            callWebService();
        } catch (WebServiceExceptionExample e) {
            System.out.println("Se ha producido una WebServiceException: " + e.getMessage());
        }
    }
}