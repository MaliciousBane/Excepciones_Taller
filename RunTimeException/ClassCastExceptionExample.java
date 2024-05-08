/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package RunTimeException;
public class ClassCastExceptionExample {
    public static void main(String[] args) {
        try {
            Object obj = new Object();
            String str = (String) obj;
        } catch (ClassCastException e) {
            System.out.println("Se ha producido una ClassCastException: " + e.getMessage());
        }
    }
}