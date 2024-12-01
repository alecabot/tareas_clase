package C2;

import java.util.Scanner;

public class Ejercicio4 {

    /*
    Ejercicio N.º 3 - Arreglos: Vectores - Individual
    Una web de meteorología necesita de un programa que, al ingresar las 7 temperaturas máximas de la última semana,
    calcule la temperatura máxima promedio que hubo.
    Para ello, deberá manejar un vector donde en cada posición se almacene la correspondiente temperatura máxima de cada día.
    Una vez almacenadas las temperaturas,
    deberá calcular el promedio de las mismas recorriendo el vector y mostrando el resultado por pantalla.
    */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String salir = "";

        String[][] asientos = {
                {"X", "X", "X", "X", "X"},
                {"X", "X", "X", "X", "X"},
                {"X", "X", "X", "X", "X"},
                {"X", "X", "X", "X", "X"},
                {"X", "X", "X", "X", "X"},
        };
        verAsientos(asientos);

        // Bucle principal para la compra de asientos
        do {
            System.out.println("Elige la opcion que deseas hacer: ");
            System.out.println("1. ver asientos");
            System.out.println("2. comprar asientos");
            System.out.println("3. Salir");
            String opcion = scanner.nextLine();

            switch (opcion){
                case "1":
                    verAsientos(asientos);
                    break;
                case "2":
                    comprarAsientos(scanner, asientos, salir);
                    break;
                case "3":
                    System.out.println("Adios, gracias por usar nuestros servicios");
                    salir = "S";
                    break;
                default:
                    System.out.println("opcion incorrecta");
            }


        } while (!salir.equalsIgnoreCase("S")); // Repetir hasta que el usuario decida salir

        System.out.println("gracias por compra de las entradas");

    }

    private static String comprarAsientos(Scanner scanner, String[][] asientos, String salir) {
        int fila;
        int columna;
        System.out.println("introduzca la fila: ");
        fila = scanner.nextInt();
        System.out.println("introduzca el asiento: ");
        columna = scanner.nextInt();
        scanner.nextLine(); // Consumir el carácter de nueva línea pendiente

        // Verificar si el asiento está ocupado
        if (asientos[fila - 1][columna - 1].equalsIgnoreCase("O")) {
            System.out.println("El asiento ya está ocupado. Por favor, elija otro asiento.");
        } else {
            // Marcar el asiento como ocupado
            asientos[fila - 1][columna - 1] = "O";
            System.out.println("gracias por la compra");
        }
        return salir;
    }

    private static void verAsientos(String[][] asientos) {
        System.out.print("        ");
        for (int j = 0; j < asientos[0].length; j++) {
            System.out.printf("%-10s", "Asiento " + (j + 1));
        }
        System.out.println();

        for (int i = 0; i < asientos.length; i++) {
            System.out.printf("%-10s", "Fila " + (i + 1));
            for (int j = 0; j < asientos[i].length; j++) {
                System.out.printf("%-10s", asientos[i][j]);
            }
            System.out.println();
        }
    }
}       