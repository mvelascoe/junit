# Proyecto de Ejemplo - Clase `Example`

Este proyecto contiene una clase llamada `Example` que implementa varios métodos útiles para realizar operaciones comunes en Java. Además, incluye una clase de prueba `ExampleTest` que utiliza JUnit para verificar la correcta funcionalidad de los métodos de la clase `Example`.

## Contenido

### Clase `Example`

La clase `Example` incluye los siguientes métodos:

1. **`sumar(int a, int b)`**: Suma dos números enteros.
2. **`checkPositivo(int numero)`**: Lanza una excepción si el argumento es negativo.
3. **`contarLetrasA(String cadena)`**: Cuenta el número de letras 'a' en una cadena.
4. **`contieneElemento(List<String> lista, String elemento)`**: Retorna `true` si la lista contiene el elemento dado.
5. **`revertirCadena(String cadena)`**: Revierte una cadena.
6. **`factorial(int numero)`**: Calcula el factorial de un número.
7. **`esPrimo(int numero)`**: Verifica si un número es primo.
8. **`mensajeConRetraso()`**: Simula un retraso y retorna un mensaje.
9. **`convertirAString(List<Integer> lista)`**: Convierte una lista de enteros a una lista de strings.
10. **`calcularMedia(List<Integer> lista)`**: Calcula la media de una lista de enteros.
11. **`convertirListaAString(List<String> lista)`**: Convierte una lista de strings a una cadena en mayúsculas.

### Clase de Prueba `ExampleTest`

La clase `ExampleTest` contiene pruebas unitarias para cada método de la clase `Example`. Utiliza las siguientes aserciones de JUnit para validar el comportamiento esperado:

- **`assertEquals()`**: Verifica que el resultado sea igual al valor esperado.
- **`assertTrue()`**: Verifica que una condición sea verdadera.
- **`assertFalse()`**: Verifica que una condición sea falsa.
- **`assertNotNull()`**: Verifica que un objeto no sea nulo.
- **`assertInstanceOf()`**: Verifica que un objeto sea de un tipo específico.
- **`assertThrows()`**: Verifica que se lance una excepción para un caso específico.

## Cómo Ejecutar las Pruebas

1. Asegúrate de tener configurado JUnit en tu proyecto.
2. Compila las clases del proyecto.
3. Ejecuta la clase `ExampleTest` para realizar todas las pruebas unitarias.

**Autor:** Maritza Velasco

## Ejemplo de Uso

```java
Example example = new Example();
int suma = example.sumar(5, 10);
System.out.println("Suma: " + suma); // Suma: 15
