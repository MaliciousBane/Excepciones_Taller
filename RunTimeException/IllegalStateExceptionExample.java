/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package RunTimeException;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class IllegalStateExceptionExample {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");

        try {
            // Intentar modificar la lista mientras se itera sobre ella
            Iterator<String> iterator = names.iterator();
            while (iterator.hasNext()) {
                String name = iterator.next();
                if (name.equals("Bob")) {
                    names.remove(name); // Esto debería lanzar una IllegalStateException
                }
            }
        } catch (IllegalStateException e) {
            System.out.println("Se ha producido una IllegalStateException: " + e.getMessage());
        }
    }
}
