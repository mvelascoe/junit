package com.junit;

import java.util.List;

public class Example {

    // Metodo para sumar dos numero enteros
    public int sumar(int a, int b) {
        return a + b;
    }

    // 2. Método que lanza una excepción si el argumento es negativo
    public boolean checkPositivo(int numero) {
        if (numero < 0) {
            throw new IllegalArgumentException("El número no puede ser negativo");// excepcion
        }
        return true;
    }

    // 3. Método para contar el número de letras 'a' en una cadena
    public int contarLetrasA(String cadena) {
        return (int) cadena.chars()
                .filter(letra -> letra == 'a')
                .count();
    }

    // 4. Método que retorna un valor booleano si la lista contiene el elemento
    public boolean contieneElemento(List<String> lista, String elemento) {
        return lista.contains(elemento);
    }

    // 5. Método para revertir una cadena
    public String revertirCadena(String cadena) {
        return new StringBuilder(cadena).reverse().toString();
    }

    // 6. Método que calcula el factorial de un número
    public long factorial(int numero) {
        if (numero < 0) {
            throw new IllegalArgumentException("Factorial no definido para números negativos");
        }
        long resultado = 1;
        for (int i = 1; i <= numero; i++) {
            resultado *= i;
        }
        return resultado;
    }

    // 7. Método para verificar si un número es primo
    public boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i * i <= numero; i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

    // 8. Método que simula un retraso y retorna un mensaje
    public String mensajeConRetraso() throws InterruptedException {
        Thread.sleep(5000);
        return "Listo después de retraso";
    }

}
