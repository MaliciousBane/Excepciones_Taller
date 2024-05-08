/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package RunTimeException;
public class NegativeArraySizeExceptionExample {
    public static void main(String[] args) {
        try {
            int negativeSize = -5;
            int[] array = new int[negativeSize]; 
        } catch (NegativeArraySizeException e) {
            System.out.println("Se ha producido una NegativeArraySizeException: " + e.getMessage());
        }
    }
}
