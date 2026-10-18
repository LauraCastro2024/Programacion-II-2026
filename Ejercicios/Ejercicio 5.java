/* Ejercicio 05 - Cantidad de vocales de un texto

   Programación II - 2026

   El programa almacena el texto "PROGRAMACION JAVA" en una variable String,

   lo recorre carácter por carácter mediante una estructura repetitiva y

   cuenta cuántas vocales encuentra. Al final muestra el texto analizado,

   su cantidad total de caracteres y la cantidad de vocales. */

public class Ejercicio05

{

    // Este es el programa principal

    public static void main (String[] args)

    {

        // El texto a analizar se guarda en una variable de tipo String.

        // Un String es una cadena de caracteres que se escribe entre comillas

        // dobles y cada carácter tiene una posición o índice.

        String texto = "PROGRAMACION JAVA";

        int vocales = 0;    // Este es el contador que empieza en 0 y sube de a 1 por vocal

        char letra;         // Guarda el carácter que se está revisando

        // texto.length(): Esto devuelve la cantidad de caracteres del String (17).

        // IMPORTANTE: las posiciones van de 0 a length()-1, o sea de 0 a 16.

        // Por eso el for arranca en i = 0 y la condición es i < length()

        // (con <= se saldría del texto y el programa daría error).

        for (int i = 0; i < texto.length(); i++)

        {

            // texto.charAt(i) devuelve el carácter que está en la posición i.

            // Ejemplo: charAt(0) es 'P', charAt(1) es 'R', charAt(2) es 'O'.

       

     letra = texto.charAt(i);

            // Se compara la letra actual contra cada una de las 5 vocales.

            // Los caracteres sueltos van entre comillas SIMPLES ('A'),

            // mientras que el String va entre comillas dobles ("A").

            // El || significa "o": alcanza con que se cumpla una comparación.

            if (letra == 'A' || letra == 'E' || letra == 'I' || letra == 'O' || letra == 'U')

            {

                vocales = vocales + 1;    // Acá encuentra una vocal por lo que sube el contador

            }

        }

        // Muestra los resultados pedidos por el enunciado

        System.out.println("Texto analizado: " + texto);

        System.out.println("Cantidad de caracteres: " + texto.length());

        System.out.println("Cantidad de vocales: " + vocales);

    }

}
