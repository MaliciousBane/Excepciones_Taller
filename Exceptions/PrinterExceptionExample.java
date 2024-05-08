/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Exceptions;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;

public class PrinterExceptionExample {
    public static void main(String[] args) {
        try {
            PrinterJob printerJob = PrinterJob.getPrinterJob();
            printerJob.print();
        } catch (PrinterException e) {
            System.out.println("Se ha producido un PrinterException: " + e.getMessage());
        }
    }
}
