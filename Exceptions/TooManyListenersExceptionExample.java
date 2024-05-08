/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Exceptions;
import java.util.EventListener;
import java.util.TooManyListenersException;

public class TooManyListenersExceptionExample {
    public static void main(String[] args) {
        try {
            addListener();
        } catch (TooManyListenersException e) {
            System.out.println("Se ha producido una TooManyListenersException: " + e.getMessage());
        }
    }

    private static void addListener() throws TooManyListenersException {
        for (int i = 0; i < 100; i++) {
            addListenerToList(i);
        }
    }

    private static void addListenerToList(int index) throws TooManyListenersException {
        if (index >= 10) {
            throw new TooManyListenersException("Se han agregado demasiados listeners");
        }
    }
}
