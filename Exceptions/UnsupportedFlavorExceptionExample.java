/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Exceptions;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;

public class UnsupportedFlavorExceptionExample {
    public static void main(String[] args) throws ClassNotFoundException {
        try {
            getDataFlavor("text/plain");
        } catch (UnsupportedFlavorException e) {
            System.out.println("Se ha producido una UnsupportedFlavorException: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Se ha producido un IOException: " + e.getMessage());
        }
    }

    private static void getDataFlavor(String flavor) throws UnsupportedFlavorException, IOException, ClassNotFoundException {
        DataFlavor dataFlavor = new DataFlavor(flavor);
        throw new UnsupportedFlavorException(dataFlavor);
    }
}
