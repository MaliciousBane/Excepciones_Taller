/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package RunTimeException;
public class NullPointerExceptionExample {
    public static void main(String[] args) {
        String str = null;
        try {
            str.length(); 
        } catch (NullPointerException e) {
            System.out.println("Se ha producido una NullPointerException: " + e.getMessage());
        }
    }
}
