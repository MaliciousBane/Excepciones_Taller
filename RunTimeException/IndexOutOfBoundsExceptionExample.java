/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package RunTimeException;
import java.util.ArrayList;
import java.util.List;

public class IndexOutOfBoundsExceptionExample {
    public static void main(String[] args) {
        List<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");

        try {
            String color = colors.get(3); 
            System.out.println("Color obtenido: " + color);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Se ha producido una IndexOutOfBoundsException: " + e.getMessage());
        }
    }
}
