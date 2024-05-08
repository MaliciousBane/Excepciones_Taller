/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package RunTimeException;
import java.util.ArrayList;
import java.util.NoSuchElementException;

public class NoSuchElementExceptionExample {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        try {
            String element = list.get(5); 
        } catch (NoSuchElementException e) {
            System.out.println("Se ha producido una NoSuchElementException: " + e.getMessage());
        }
    }
}
