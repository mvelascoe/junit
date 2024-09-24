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
    private Example example; // Declaramos la variable de tipo Example que se usara en las pruebas

    // Método que se ejecuta antes de cada prueba para inicializar el objeto Example
    @BeforeEach
    public void init() {
        this.example = new Example(); // Se instancia el objeto antes de cada prueba
    }

    @Test
    public void testSumar() {
        // Given - Se definen los elementos necesarios para la prueba
        int numberA = 5;
        int numberB = 10;
        // When - Cuando, se ejecuta el método a probar con los elementos dados
        int result = example.sumar(numberA, numberB);
        // Then - Entonces, se validan los resultados esperados
        assertNotNull(result); // Se verifica que el resultado no sea nulo
        assertEquals(15, result); // Se verifica que el resultado sea igual a 15
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

    // 6. Método que calcula el factorial de un número
    @Test
    public void testFactorial() {
        // Given
        int numero = 3;
        // When
        long resultado = example.factorial(numero);
        // Then
        assertEquals(6, resultado); // 3! = 3×2×1 = 6
    }

    @Test
    public void testEsPrimo() {
        // Given
        int numeroPrimo = 11;
        int numeroNoPrimo = 22;
        // When
        boolean resultadoPrimo = example.esPrimo(numeroPrimo);
        boolean resultadoNoPrimo = example.esPrimo(numeroNoPrimo);
        // Then
        assertTrue(resultadoPrimo); // 11 es primo
        assertFalse(resultadoNoPrimo); // 22 no es primo
    }

    // 8. Método que simula un retraso y retorna un mensaje
    @Test
    public void testMensajeConRetraso() throws InterruptedException {
        // Given
        // :(
        // When
        String resultado = example.mensajeConRetraso();
        // Then
        assertEquals("Listo después de retraso", resultado); // Mensaje esperado
    }

    // 9. Método para convertir una lista de enteros a lista de strings
    @Test
    public void testConvertirAString() {
        // Given
        List<Integer> listaEnteros = Arrays.asList(1, 2, 3, 4, 5);
        // When
        List<String> resultado = example.convertirAString(listaEnteros);
        // Then
        assertEquals(Arrays.asList("1", "2", "3", "4", "5"), resultado); // Se convierte en String
    }

    // 10. Método que calcula la media de una lista de enteros
    @Test
    public void testCalcularMedia(){
        // Given
        List<Integer> lista = Arrays.asList(1, 2, 3, 4, 5);
        // When
        double resultado = example.calcularMedia(lista);
        // Then
        assertEquals(3.0, resultado); // 1 + 2 + 3 + 4 + 5 = 15   15/5 = 3
    }
    

}
