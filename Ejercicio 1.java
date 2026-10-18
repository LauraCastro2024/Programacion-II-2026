/* Ejercicio 01 - Distribución de estudiantes en equipos

   Programación II - 2026

   El programa solicita la cantidad total de estudiantes y cuántos

   van por equipo, luego calcula los equipos completos y los

   estudiantes que sobran. */

import java.util.Scanner;

public class Ejercicio01

{

    // Este es el programa principal

    public static void main (String[] args)

    {

        // Objeto para leer datos desde el teclado (entrada estándar)

        Scanner entrada = new Scanner(System.in);

        // Solicitar y leer la cantidad total de estudiantes

        System.out.print("Ingrese la cantidad total de estudiantes: ");

        int totalEstudiantes = entrada.nextInt();

        // Solicitar y leer la cantidad de estudiantes por equipo

        System.out.print("Ingrese la cantidad de estudiantes por equipo: ");

        int estudiantesPorEquipo = entrada.nextInt();

        // Mostrar los valores ingresados

        System.out.println("Cantidad total de estudiantes: " + totalEstudiantes);

        System.out.println("Estudiantes por equipo: " + estudiantesPorEquipo);

        // Cantidad de equipos completos: división entera (/)

        int equiposCompletos = totalEstudiantes / estudiantesPorEquipo;

        // Estudiantes que quedan sueltos: resto de la división (%)

        int estudiantesRestantes = totalEstudiantes % estudiantesPorEquipo;

        // Mostrar los resultados

        System.out.println("Se pueden formar " + equiposCompletos + " equipos completos.");

        System.out.println("Quedan " + estudiantesRestantes + " estudiantes sin integrar un equipo completo.");

        // Cerrar el Scanner

        entrada.close();

    }

}

![Resultado del ejercicio](Ejercicio1.png)
