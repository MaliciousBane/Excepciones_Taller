/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package RunTimeException;
import java.awt.image.BufferedImage;
import java.awt.image.BufferedImageOp;
import java.awt.image.ConvolveOp;
import java.awt.image.Kernel;
import java.awt.image.ImagingOpException;

public class ImagingOpExceptionExample {
    public static void main(String[] args) {
        try {

            BufferedImage image = new BufferedImage(100, 100, BufferedImage.TYPE_INT_RGB);
            Kernel kernel = new Kernel(3, 3, new float[9]); 
            BufferedImageOp op = new ConvolveOp(kernel);
            BufferedImage result = op.filter(image, null);
        } catch (ImagingOpException e) {
            System.out.println("Se ha producido una ImagingOpException: " + e.getMessage());
        }
    }
}