/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package RunTimeException;
import java.time.LocalDate;
import java.time.DateTimeException;

public class DateTimeExceptionExample {
    public static void main(String[] args) {
        try {
            LocalDate invalidDate = LocalDate.of(2023, 2, 30); 
        } catch (DateTimeException e) {
            System.out.println("Se ha producido una DateTimeException: " + e.getMessage());
        }
    }
}
