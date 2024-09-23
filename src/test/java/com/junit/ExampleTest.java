package com.junit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertInstanceOf;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ExampleTest {
    private Example example; //Declaramos la variable de tipo Example que se usara en las pruebas

    // Método que se ejecuta antes de cada prueba para inicializar el objeto Example
    @BeforeEach
    public void init(){
        this.example = new Example();  //Se instancia el objeto antes de cada prueba
    }

    @Test
    public void testSumar(){
        //Given - Se definen los elementos necesarios para la prueba
        int numberA = 5;
        int numberB = 10;
        //When - Cuando, se ejecuta el método a probar con los elementos dados
        int result = example.sumar(numberA, numberB);
        //Then - Entonces, se validan los resultados esperados
        assertNotNull(result); // Se verifica que el resultado no sea nulo
        assertEquals(15, result);  // Se verifica que el resultado sea igual a 15
        assertInstanceOf(Integer.class, result); // Se verifica que el resultado sea de tipo Integer
    }

    // 2. Método que lanza una excepción si el argumento es negativo
    @Test
    public void testCheckPositivo() {
        // Given
        int numeroPositivo = 5;
        int numeroNegativo = -5;
        // When
        boolean resultadoPositivo = example.checkPositivo(numeroPositivo);
        // Then
        assertTrue(resultadoPositivo); // Verifica que el resultado sea True

        // Verificamos la excepción para número negativo
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            example.checkPositivo(numeroNegativo);
        });
        assertEquals("El número no puede ser negativo", exception.getMessage());
    }

    // 3. Método para contar el número de letras 'a' en una cadena
    @Test
    public void testContarLetrasA() {
         // Given
         String cadena = "maritza";
         String cadena2 = "calabaza";
         // When
         int resultado = example.contarLetrasA(cadena);
         int resultado2 = example.contarLetrasA(cadena2);
         // Then
         assertEquals(2, resultado); // Debe haber 2 letras 'a'
         assertEquals(4, resultado2); // Debe haber 4 letras 'a'
    }

    // 4. Método que retorna un valor booleano si la lista contiene el elemento
    @Test
    public void testContieneElemento() {
        // Given
        List<String> lista = Arrays.asList("argentina", "españa", "alemania");
        String elementoPresente = "argentina";
        String elementoFaltante = "portugal";
        // When
        boolean siContiene = example.contieneElemento(lista, elementoPresente);
        boolean noContiene = example.contieneElemento(lista, elementoFaltante);
        // Then
        assertTrue(siContiene); // Debe contener 'argentian'
        assertFalse(noContiene); // No debe contener 'portugal'
    }

    // 5. Método para revertir una cadena
    @Test
    public void testRevertirCadena() {
        // Given
        String cadena = "arroz";
        // When
        String resultado = example.revertirCadena(cadena);
        // Then
        assertEquals("zorra", resultado); // La cadena alveres
    }

    


}
