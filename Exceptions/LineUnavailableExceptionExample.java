/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Exceptions;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Mixer;
import javax.sound.sampled.Line;
import javax.sound.sampled.LineUnavailableException;

public class LineUnavailableExceptionExample {
    public static void main(String[] args) {
        try {
            Mixer.Info[] mixerInfo = AudioSystem.getMixerInfo();
            Mixer mixer = AudioSystem.getMixer(mixerInfo[0]);
            Line line = mixer.getLine(mixer.getSourceLineInfo()[0]);
            line.open(); // Intentar abrir la línea de audio
            System.out.println("Línea de audio abierta con éxito.");
        } catch (LineUnavailableException e) {
            System.out.println("Se ha producido una LineUnavailableException: " + e.getMessage());
        }
    }
}
