package C2;

import java.util.Scanner;

public class Ejercicio2 {

    /*
    Ejercicio Nº 2 - Estructuras Repetitivas - Individual
    a) Imagina que eres un cajero en un supermercado.
    Crea un programa en Java que permita ingresar el precio de varios productos comprados por un cliente.
    Utiliza una estructura repetitiva (la que quieras) para continuar pidiendo precios hasta que el usuario decida finalizar.
    Luego, muestra el total de la compra que debe abonar.
    */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        // Declarar variables para el precio y el total
        double precio;
        double total = 0;

        // Bucle infinito para ingresar precios de productos
        while (true) {
            // Solicitar al usuario que ingrese el precio del producto
            System.out.println("ingresa precio del producto, si deseas salir pulse 0: ");
            precio = scanner.nextDouble();

            // Verificar si el usuario desea salir
            if (precio == 0) {
                break;
            }

            // Sumar el precio ingresado al total
            total += precio;
        }

        // Mostrar el precio total de todos los productos
        System.out.println("el precio total de todos los productos es: " + total);
    }
}
