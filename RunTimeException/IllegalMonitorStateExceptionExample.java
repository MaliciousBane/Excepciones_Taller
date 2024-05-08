/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package RunTimeException;
public class IllegalMonitorStateExceptionExample {
    public static void main(String[] args) {
        Object monitor = new Object();

        try {
            synchronized (monitor) {
                System.out.println("Dentro del bloque sincronizado");
            }
            monitor.notify(); 
        } catch (IllegalMonitorStateException e) {
            System.out.println("Se ha producido una IllegalMonitorStateException: " + e.getMessage());
        }
    }
}
