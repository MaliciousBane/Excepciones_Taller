/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package RunTimeException;
import java.nio.ByteBuffer;
import java.nio.BufferOverflowException;

public class BufferOverflowExceptionExample {
    public static void main(String[] args) {
        try {
            ByteBuffer buffer = ByteBuffer.allocate(5);
            buffer.put(new byte[10]);
        } catch (BufferOverflowException e) {
            System.out.println("Se ha producido una BufferOverflowException: " + e.getMessage());
        }
    }
}
