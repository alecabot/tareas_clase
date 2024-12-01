package C1;

/*
Crea un programa que puda al usuario que ingrese por teclado dos números enteris y realice las siguientes operaciones con ellos:
suma, resta, multiplicación y division
Muestra por pantalla/consola los resultadosde cada una de las operaciones con un mensaje amigable para el usuario
 */

import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Declaración de variables para almacenar los números ingresados por el usuario
        double num1, num2;

        // Solicitar al usuario que ingrese el primer número
        System.out.println("Introduzca el primer número: ");
        num1 = scanner.nextDouble();

        // Solicitar al usuario que ingrese el segundo número
        System.out.println("Introduzca el segundo número: ");
        num2 = scanner.nextDouble();

        // Realizar y mostrar la suma de los dos números
        System.out.printf("La suma de %s + %s es: %.2f\n", num1, num2, (num1 + num2));

        // Realizar y mostrar la resta de los dos números
        System.out.printf("La resta de %s - %s es: %.2f\n", num1, num2, (num1 - num2));

        // Realizar y mostrar la multiplicación de los dos números
        System.out.printf("La multiplicación de %s x %s es: %.2f\n", num1, num2, (num1 * num2));


        // extra
        // Verificar si el segundo número es cero antes de realizar la división
        if (num2 == 0) {
            // Mostrar mensaje de error si el segundo número es cero
            System.out.println("La división no se puede realizar ya que no se puede dividir entre 0");
        } else {
            // Realizar y mostrar la división de los dos números
            System.out.printf("La división de %s / %s es: %.2f\n", num1, num2, (num1 / num2));
        }
    }

}
