/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Exceptions;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.UnsupportedAudioFileException;
import java.io.File;
import java.io.IOException;

public class UnsupportedAudioFileExceptionExample {
    public static void main(String[] args) {
        try {
            loadAudioFile("unsupported_audio.wav");
        } catch (UnsupportedAudioFileException e) {
            System.out.println("Se ha producido una UnsupportedAudioFileException: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Se ha producido un IOException: " + e.getMessage());
        }
    }

    private static void loadAudioFile(String fileName) throws UnsupportedAudioFileException, IOException {
        File audioFile = new File(fileName);
        AudioSystem.getAudioInputStream(audioFile);
    }
}
