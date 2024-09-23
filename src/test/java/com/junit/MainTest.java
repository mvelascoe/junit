package com.junit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MainTest {
 private Main main;
    @BeforeEach
    public void init() {
        this.main = new Main();
    }
    @Test
    public void testMain() {
        // Configura la captura de la salida de System.out
        // ByteArrayOutputStream es una clase predefinida en Java (java.io):
        // permite capturar datos en un flujo de bytes en memoria en lugar de enviarlos a la consola.
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        
        // System.setOut(new PrintStream(outContent)) redirige la salida estándar de la consola 
        // (System.out) hacia el objeto outContent, lo que permite capturar lo que se imprima en la consola.
        System.setOut(new PrintStream(outContent));
    
        // Ejecutamos el metodo main de la clase 'Main'. 
        // Se pasa un array vacío de tipo String como argumento, ya que el método main espera un array de Strings.
        Main.main(new String[]{});
    
        // Verificar que la salida capturada es la esperada.
        // assertEquals es un método predefinido que compara el valor esperado con el valor actual.
        // En este caso, el valor esperado es "Hello world!\n", que representa lo que debería haberse impreso en la consola,
        // y el valor actual es el contenido capturado por 'outContent'.
        assertEquals("Hello world!", outContent.toString().trim());
    }
}