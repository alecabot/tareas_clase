package C2;

import java.util.Scanner;

public class Ejercicio1 {

    /*
    Ejercicio N.º 1 - Estructuras Condicionales - Individual
    a) Un recital permite únicamente el ingreso de mayores de 18 años.
    Para ello necesita un programa que, a partir de que un usuario ingrese su edad,
    determine mediante un mensaje
    en pantalla si la persona puede o no ingresar al evento.
    El programa debe mostrar (según cada caso) un mensaje informando la situación.
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        // Declarar una variable para almacenar la edad
        int edad;

        // Solicitar al usuario que ingrese su edad
        System.out.println("Ingresa tu edad: ");
        edad = scanner.nextInt();

        // Verificar si la edad es mayor o igual a 18
        if (edad >= 18) {
            // Si la edad es mayor o igual a 18, permitir el ingreso al evento
            System.out.println("puedes ingresar al evento");
        } else {
            // Si la edad es menor a 18, no permitir el ingreso al evento
            System.out.println("no puedes ingresar al evento");
        }
    }
}
