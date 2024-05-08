/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Exceptions;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

public class DataFormatExceptionExample {
    public static void main(String[] args) {
        byte[] compressedData = {0x78, 0x9C, 0x63, 0x64, 0x00, 0x00, 0x00, 0x02, 0x00, 0x01}; 

        try {
            decompressData(compressedData);
        } catch (DataFormatException e) {
            System.out.println("Se ha producido una DataFormatException: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Se ha producido una IOException: " + e.getMessage());
        }
    }

    private static void decompressData(byte[] compressedData) throws DataFormatException, IOException {
        Inflater inflater = new Inflater();
        inflater.setInput(compressedData);

        byte[] decompressedData = new byte[1024];
        int decompressedSize = inflater.inflate(decompressedData);

        if (!inflater.finished()) {
            throw new DataFormatException("¡El descompresor ha fallado!");
        }

        System.out.println("Datos descomprimidos: " + new String(decompressedData, 0, decompressedSize));
    }
}