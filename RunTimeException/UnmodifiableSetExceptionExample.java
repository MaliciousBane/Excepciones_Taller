/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package RunTimeException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import javax.print.attribute.UnmodifiableSetException;

public class UnmodifiableSetExceptionExample {
    public static void main(String[] args) {
        try {
            Set<String> immutableSet = Collections.unmodifiableSet(new HashSet<>()); 
            immutableSet.add("Elemento");
        } catch (UnmodifiableSetException e) {
            System.out.println("Se ha producido una UnmodifiableSetException: " + e.getMessage());
        } catch (UnsupportedOperationException e) {
            System.out.println("Se ha producido una UnsupportedOperationException: " + e.getMessage());
        }
    }
}
