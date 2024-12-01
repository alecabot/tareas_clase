package C1;

/*
a) Escribir un programa en Java que muestre por pantalla un mensaje de bienvenida a un usuario.
Por ejemplo: "Hola, bienvenido al sistema".

b) Una vez logrado esta primera parte, permitir que se almacene el nombre del usuario en una variable
y se muestre al mismo en el mensaje. Por ejemplo: "Hola Eduardo, bienvenido al sistema".
 */

public class Ejercicio1 {
    public static void main(String[] args) {
        // apartado a
        // Mostrar un mensaje de bienvenida por pantalla
        System.out.println("Hola, bienvenido al sistema");

        // apartado b
        // Declarar una variable para almacenar el nombre del usuario
        String nombre = "Alejandro";

        // Mostrar un mensaje de bienvenida personalizado con el nombre del usuario
        System.out.printf("Hola %s, bienvenido al sistema", nombre);
    }
}