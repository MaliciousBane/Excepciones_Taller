/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package RunTimeException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UnsupportedOperationExceptionExample {
    public static void main(String[] args) {
        try {
            List<String> immutableList = Collections.unmodifiableList(new ArrayList<>());
            immutableList.add("Elemento");
        } catch (UnsupportedOperationException e) {
            System.out.println("Se ha producido una UnsupportedOperationException: " + e.getMessage());
        }
    }
}
