/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Exceptions;
import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiEvent;
import javax.sound.midi.MidiMessage;
import javax.sound.midi.Sequence;
import javax.sound.midi.ShortMessage;

public class InvalidMidiDataExceptionExample {
    public static void main(String[] args) {
        try {
         
            Sequence sequence = new Sequence(Sequence.PPQ, 96);
            sequence.getTracks()[0].add(new MidiEvent(new InvalidMidiMessage(), 0));

            
            processMidiSequence(sequence);
        } catch (InvalidMidiDataException e) {
            System.out.println("Se ha producido una InvalidMidiDataException: " + e.getMessage());
        }
    }

    private static void processMidiSequence(Sequence sequence) throws InvalidMidiDataException {
        for (int i = 0; i < sequence.getTracks().length; i++) {
            for (int j = 0; j < sequence.getTracks()[i].size(); j++) {
                MidiEvent event = sequence.getTracks()[i].get(j);
                MidiMessage message = event.getMessage();
               
            }
        }
    }

    private static class InvalidMidiMessage extends ShortMessage {
        public InvalidMidiMessage() throws InvalidMidiDataException {
            // Crear un mensaje MIDI inválido
            setMessage(0xFF, 0, 0);
        }
    }
}
