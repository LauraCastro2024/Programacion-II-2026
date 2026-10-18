/* Ejercicio 02 - Suma de números hasta un valor aleatorio

   Programación II - 2026

   El programa genera un entero al azar entre 1 y 20, lo muestra,

   y calcula la suma de todos los enteros desde 1 hasta ese valor

   usando una estructura repetitiva (for). */

public class Ejercicio02

{

    // Este es el programa principal

    public static void main (String[] args)

    {

        // Generar un entero al azar entre 1 y 20 (ambos incluidos)

        int m = (int) (Math.random() * 20) + 1;

        // Mostrar el número generado

        System.out.println("Número generado: " + m);

        // Sumar todos los enteros desde 1 hasta m con un ciclo

        int suma = 0;

        for (int i = 1; i <= m; i++)

        {

            suma = suma + i;

        }

        // Mostrar el resultado

        System.out.println("La suma de los números enteros entre 1 y " + m + " es: " + suma);

    }

}
