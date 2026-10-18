/* Ejercicio 03 - Suma de números impares

   Programación II - 2026

   El programa genera enteros al azar entre 0 y 10, indica si cada uno

   es par o impar, y acumula solamente los impares. El proceso se repite

   mientras la suma de los impares sea menor o igual que 25. */

public class Ejercicio03

{

    // Este es el programa principal

    public static void main (String[] args)

    {

        int suma = 0;    // Acumula los números impares

        int numero;      // Número generado en cada vuelta

        do

        {

            // Genera un entero al azar entre 0 y 10 (ambos incluidos)

            numero = (int) (Math.random() * 11);

            // Verifica la paridad del número generado

            if (numero % 2 == 0)

            {

                System.out.println("Número generado: " + numero + " - Es par");

            }

            else

            {

                System.out.println("Número generado: " + numero + " - Es impar");

                suma = suma + numero;    // Solo se acumulan los números impares

            }

        }

        while (suma <= 25);    // Se repite mientras la suma no supera 25

        // Muestra el resultado final

        System.out.println("La suma de los números impares es: " + suma);

        System.out.println("La suma supera el valor 25. El proceso ha finalizado.");

    }

}
