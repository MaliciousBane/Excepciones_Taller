/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package RunTimeException;
import java.awt.image.Raster;
import java.awt.image.RasterFormatException;

public class RasterFormatExceptionExample {
    public static void processRaster(Raster raster) throws RasterFormatException {
        if (raster.getWidth() < 0 || raster.getHeight() < 0) {
            throw new RasterFormatException("El formato del raster es inválido");
        } else {
            System.out.println("Procesando raster de tamaño: " + raster.getWidth() + "x" + raster.getHeight());
        }
    }

    public static void main(String[] args) {
        try {
            Raster invalidRaster = Raster.createInterleavedRaster(-10, -10, 3, 3, 1, new int[] { 0, 1, 2 }, null);
            processRaster(invalidRaster);
        } catch (RasterFormatException e) {
            System.out.println("Se ha producido una RasterFormatException: " + e.getMessage());
        }
    }
}
