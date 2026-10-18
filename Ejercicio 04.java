/* Ejercicio 04 - Día de la semana

   Programación II - 2026

   El programa genera un número entero al azar entre 1 y 7, lo muestra en

   pantalla y, mediante una estructura switch, despliega el día de la

   semana que le corresponde (1 = lunes ... 7 = domingo). */

public class Ejercicio04

{

    // Este es el programa principal

    public static void main (String[] args)

    {

        String dia;    // Guarda el nombre del día que corresponde al número

        // Genera un entero al azar entre 1 y 7 (ambos incluidos).

        // Math.random() da un decimal entre 0 y casi 1 (nunca llega a 1).

        // Al multiplicarlo por 7 queda entre 0 y casi 7.

        // El (int) recorta los decimales -> valores enteros de 0 a 6.

        // Por eso se suma + 1 al final -> valores de 1 a 7.

        int numero = (int) (Math.random() * 7) + 1;

        // Muestra el número que salió sorteado

        System.out.println("Número generado: " + numero);

        // La estructura switch compara el valor de numero contra cada caso.

        // Cuando encuentra el que coincide, ejecuta esa línea.

        // El break corta el switch: sin él, seguiría ejecutando los demás casos.

        switch (numero)

        {

            case 1:

                dia = "lunes";

                break;

            case 2:

                dia = "martes";

                break;

            case 3:

                dia = "miércoles";

                break;

            case 4:

                dia = "jueves";

                break;

            case 5:

                dia = "viernes";

                break;

            case 6:

                dia = "sábado";

                break;

            case 7:

                dia = "domingo";

                break;

            // El default se ejecuta si el valor no coincide con ningún caso.

            // Con el rango 1 a 7 nunca debería entrar acá, pero se incluye

            // por seguridad y porque Java exige que dia quede inicializada.

            default:

                dia = "valor fuera de rango";

                break;

        }

        // Muestra el día correspondiente al número generado

        System.out.println("Día correspondiente: " + dia);

    }

}
