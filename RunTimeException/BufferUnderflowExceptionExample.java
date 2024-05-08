/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package RunTimeException;
import java.nio.ByteBuffer;
import java.nio.BufferUnderflowException;

public class BufferUnderflowExceptionExample {
    public static void main(String[] args) {
        try {
            ByteBuffer buffer = ByteBuffer.wrap(new byte[]{1, 2, 3, 4, 5});
            for (int i = 0; i < 10; i++) {
                byte b = buffer.get();
                System.out.println("Byte leído: " + b);
            }
        } catch (BufferUnderflowException e) {
            System.out.println("Se ha producido una BufferUnderflowException: " + e.getMessage());
        }
    }
}
