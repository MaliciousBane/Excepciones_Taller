/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package RunTimeException;
public class ArrayStoreExceptionExample {
    public static void main(String[] args) {
        try {
            Object[] objectArray = new String[5];
            objectArray[0] = 10;
        } catch (ArrayStoreException e) {
            System.out.println("Se ha producido una ArrayStoreException: " + e.getMessage());
        }
    }
}
