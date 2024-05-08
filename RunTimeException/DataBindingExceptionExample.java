/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package RunTimeException;
import javafx.beans.binding.Bindings;
import javafx.beans.binding.StringBinding;
import javafx.beans.binding.DataBindingException;

public class DataBindingExceptionExample {
    public static void main(String[] args) {
        try {
            StringBinding stringBinding = Bindings.concat("Hola", 42); 
            String result = stringBinding.get(); 
        } catch (DataBindingException e) {
            System.out.println("Se ha producido una DataBindingException: " + e.getMessage());
        }
    }
}
