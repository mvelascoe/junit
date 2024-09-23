package com.junit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertInstanceOf;
import static org.junit.jupiter.api.Assertions.assertNotNull;

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

}
