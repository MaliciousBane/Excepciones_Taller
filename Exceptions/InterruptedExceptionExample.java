/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Exceptions;

/**
 *
 * @author HP
 */
public class InterruptedExceptionExample {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            try {
                
                System.out.println("Tarea en ejecución...");
                Thread.sleep(5000);
                System.out.println("Tarea finalizada.");
            } catch (InterruptedException e) {
                System.out.println("La tarea ha sido interrumpida: " + e.getMessage());
            }
        });

        thread.start();

        try {
            
            Thread.sleep(2000);
            thread.interrupt();
        } catch (InterruptedException e) {
            System.out.println("El hilo principal ha sido interrumpido: " + e.getMessage());
        }
    }
}
