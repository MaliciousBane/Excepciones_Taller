/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Error;
public class ThreadDeathExample {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            try {
                throw new ThreadDeath();
            } catch (ThreadDeath e) {
                System.out.println("Se ha producido un ThreadDeath en el hilo: " + Thread.currentThread().getName());
            }
        });

        thread.start();

        try {
            thread.join();
        } catch (InterruptedException e) {
            System.out.println("El hilo ha sido interrumpido.");
        }
    }
}
