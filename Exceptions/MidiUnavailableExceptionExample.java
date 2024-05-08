/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Exceptions;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.Synthesizer;

public class MidiUnavailableExceptionExample {
    public static void main(String[] args) {
        try {
            // Obtener el sintetizador MIDI
            Synthesizer synthesizer = MidiSystem.getSynthesizer();
            synthesizer.open();
            System.out.println("Sintetizador MIDI abierto con éxito.");
        } catch (MidiUnavailableException e) {
            System.out.println("Se ha producido una MidiUnavailableException: " + e.getMessage());
        }
    }
}
