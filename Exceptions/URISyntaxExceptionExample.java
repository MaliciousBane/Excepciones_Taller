/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Exceptions;
import java.net.URI;
import java.net.URISyntaxException;

public class URISyntaxExceptionExample {
    public static void main(String[] args) {
        try {
            createInvalidURI();
        } catch (URISyntaxException e) {
            System.out.println("Se ha producido una URISyntaxException: " + e.getMessage());
        }
    }

    private static void createInvalidURI() throws URISyntaxException {
        URI uri = new URI("http://example.com/invalid uri");
    }
}
