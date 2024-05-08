/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package RunTimeException;
import org.w3c.dom.events.EventException;

public class EventExceptionExample {
    public static void main(String[] args) {
        try {
            ActionEvent event = new ActionEvent();
            throw new EventException("Simulación de error en el evento");
        } catch (EventException e) {
            System.out.println("Se ha producido una EventException: " + e.getMessage());
        }
    }
}
