package C1;

/*
a) Crea un programa que declare una variable para cada uno de los siguientes tipos de datos: int, double, boolean y String.
Asigna un valor a cada variable y muestra su contenido en consola.

b) Ahora, asigna valores que no correspondan al tipo de dato. Por ejemplo, un int en un String o un String en un double...
¿Qué sucede con el programa? ¿Se produce algún error? ¿En qué situaciones se genera error y en cuáles no? Justificar el porqué de cada caso.
 */

public class Ejercicio2 {
    public static void main(String[] args) {

        // apartado a
        // Declaración y asignación de variables de diferentes tipos de datos
        int edad = 23;
        double altura = 1.90;
        boolean estaDesempleado = true;
        String nombre = "Alejandro";

        // Mostrar el contenido de las variables en consola
        System.out.println("edad: " + edad);
        System.out.println("altura: " + altura);
        System.out.println("esta desempleado: " + estaDesempleado);
        System.out.println("nombre: " + nombre);

        // apartado b
        // Intento de asignar valores que no corresponden al tipo de dato
        // Esto generará errores de compilación debido a la incompatibilidad de tipos

//        int edad = true; // Error de compilación: tipos incompatibles
//        double altura = "alejandro"; // Error de compilación: tipos incompatibles
//        boolean estaDesempleado = 1.90; // Error de compilación: tipos incompatibles
//        String nombre = 23; // Error de compilación: tipos incompatibles

        // Lo que ocurre es que Java, al ser un lenguaje fuertemente tipado,
        // espera que el valor de la variable sea del mismo tipo que el declarado.
        // Si no es así, se muestra un error de compilación.
    }
}