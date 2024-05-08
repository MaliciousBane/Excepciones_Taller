/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package RunTimeException;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;

public class CompletionExceptionExample {
    public static void main(String[] args) {
        try {
            CompletableFuture<Integer> future = CompletableFuture.supplyAsync(() -> {
                throw new RuntimeException("Simulación de error durante la tarea");
            });

            future.join();
        } catch (CompletionException e) {
            System.out.println("Se ha producido una CompletionException: " + e.getMessage());
        }
    }
}
