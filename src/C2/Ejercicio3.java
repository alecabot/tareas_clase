package C2;

import java.util.Scanner;

public class Ejercicio3 {

    /*
    Ejercicio Nº 3 - Arreglos: Vectores - Individual
    Una web de meteorología necesita de un programa que, al ingresar las 7 temperaturas máximas de la última semana,
    calcule la temperatura máxima promedio que hubo.
    Para ello, deberá manejar un vector donde en cada posición se almacene la correspondiente temperatura máxima de cada día.
    Una vez almacenadas las temperaturas,
    deberá calcular el promedio de las mismas recorriendo el vector y mostrando el resultado por pantalla.
    */

    public static void main(String[] args) {

        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Inicializar
        int[] temperatura = new int[7];
        int totalTemperatura = 0;
        int promedioTemperatura = 0;

        // Bucle para solicitar y almacenar las temperaturas de cada día
        for (int i = 0; i < temperatura.length; i++) {
            System.out.println("introduzca la temperatura " + (i + 1) + ":");
            temperatura[i] = scanner.nextInt();
            // Sumar la temperatura ingresada al total
            totalTemperatura += temperatura[i];
        }

        // Calcular el promedio de las temperaturas
        promedioTemperatura = totalTemperatura / temperatura.length;

        // Mostrar el promedio de las temperaturas
        System.out.println("el promedio de las temperaturas es: " + promedioTemperatura);
    }
}
