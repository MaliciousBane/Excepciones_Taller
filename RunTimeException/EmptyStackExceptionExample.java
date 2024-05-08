/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package RunTimeException;
import java.util.Stack;
import java.util.EmptyStackException;

public class EmptyStackExceptionExample {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        try {
            String element = stack.pop();
            System.out.println("Elemento obtenido: " + element);
        } catch (EmptyStackException e) {
            System.out.println("Se ha producido una EmptyStackException: " + e.getMessage());
        }
    }
}