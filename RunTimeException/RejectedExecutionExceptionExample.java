/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package RunTimeException;
import java.util.concurrent.*;

public class RejectedExecutionExceptionExample {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(1);

        try {
            for (int i = 0; i < 5; i++) {
                executor.execute(() -> {
                    System.out.println("Ejecutando tarea en hilo: " + Thread.currentThread().getName());
                });
            }
        } catch (RejectedExecutionException e) {
            System.out.println("Se ha producido una RejectedExecutionException: " + e.getMessage());
        }

        executor.shutdown();
    }
}
