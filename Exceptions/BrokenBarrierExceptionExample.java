/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Exceptions;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class BrokenBarrierExceptionExample {
    public static void main(String[] args) {
       
        CyclicBarrier barrier = new CyclicBarrier(3);

       
        new Thread(() -> {
            try {
                System.out.println("Hilo 1 esperando en la barrera...");
                barrier.await();
                System.out.println("Hilo 1 ha pasado la barrera.");
            } catch (InterruptedException | BrokenBarrierException e) {
                System.out.println("Hilo 1 ha encontrado una BrokenBarrierException: " + e.getMessage());
            }
        }).start();

        new Thread(() -> {
            try {
                System.out.println("Hilo 2 esperando en la barrera...");
                barrier.await();
                System.out.println("Hilo 2 ha pasado la barrera.");
            } catch (InterruptedException | BrokenBarrierException e) {
                System.out.println("Hilo 2 ha encontrado una BrokenBarrierException: " + e.getMessage());
            }
        }).start();

        // Este hilo romperá la barrera
        new Thread(() -> {
            try {
                System.out.println("Hilo 3 esperando en la barrera...");
                barrier.await();
                System.out.println("Hilo 3 ha pasado la barrera.");
            } catch (InterruptedException e) {
                System.out.println("Hilo 3 ha sido interrumpido.");
            } catch (BrokenBarrierException e) {
                System.out.println("Hilo 3 ha encontrado una BrokenBarrierException: " + e.getMessage());
            }
        }).start();
    }
}

