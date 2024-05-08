/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Exceptions;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ParseExceptionExample {
    public static void main(String[] args) {
        try {
            String dateString = "2023-05-07 12:34:56";
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            Date date = dateFormat.parse(dateString);
            System.out.println("Fecha analizada: " + date);
        } catch (ParseException e) {
            System.out.println("Se ha producido una ParseException: " + e.getMessage());
        }
    }
}
