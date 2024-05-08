/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Exceptions;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutionExceptionExample {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newSingleThreadExecutor();

        Future<Integer> future = executor.submit(() -> {
            // Simular una tarea que lanza una excepción durante la ejecución
            throw new RuntimeException("Error en la tarea");
        });

        try {
            Integer result = future.get();
            System.out.println("Resultado de la tarea: " + result);
        } catch (ExecutionException e) {
            System.out.println("Se ha producido una ExecutionException: " + e.getCause().getMessage());
        } catch (InterruptedException e) {
            System.out.println("La tarea fue interrumpida");
        }

        executor.shutdown();
    }
}
