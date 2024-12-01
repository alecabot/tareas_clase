package C3.Ejercicio2;


import C3.Ejercicio1.Electrodomestico;

public class Main {
    /*
    Ejercicio N.º2 - POO - Individual
    Crear una clase Persona, que tenga los siguientes atributos: id, nombre, edad, dirección y número de teléfono
    (tener en cuenta todos sus atributos, constructores y métodos getters y setters).
    a) Crear un vector de tipo Persona cinco posiciones. Crear cinco personas y guardarlas en él.
    b) Recorrer el vector creado y mostrar por pantalla el nombre y edad de cada persona almacenada.
    c) Cambiar el nombre de dos personas. Mostrar por pantalla el antes, realizar el cambio
     y luego mostrar el después de los datos de las dos personas cuyos nombres fueron cambiados.
    d) Recorrer el vector y mostrar por pantalla únicamente a las personas cuya edad sea mayor de 30 años.
     */
    public static void main(String[] args) {
        // a) Crear un vector de tipo Persona de cinco posiciones y guardar cinco personas en él
        Persona[] personas = new Persona[5];
        personas[0] = new Persona(1, "Juan", 25, "Calle 1", 123456789);
        personas[1] = new Persona(2, "María", 30, "Calle 2", 987654321);
        personas[2] = new Persona(3, "Carlos", 38, "Calle 3", 456789123);
        personas[3] = new Persona(4, "Ana", 22, "Calle 4", 789123456);
        personas[4] = new Persona(5, "Luis", 35, "Calle 5", 321654987);

        // b) Recorrer el vector y mostrar por pantalla el nombre y edad de cada persona
        System.out.println("Personas en el vector:");
        for (Persona persona : personas) {
            System.out.println("Nombre: " + persona.getNombre() + ", Edad: " + persona.getEdad());
        }


        // Mostrar el nombre y edad de dos personas antes del cambio
        System.out.println("\nAntes del cambio: ");
        System.out.println("Persona 1: Nombre: " + personas[1].getNombre() + ", Edad: " + personas[1].getEdad());
        System.out.println("Persona 2: Nombre: " + personas[2].getNombre() + ", Edad: " + personas[2].getEdad());

        // Cambiar el nombre de dos personas
        personas[1].setNombre("Luis");
        personas[2].setNombre("Ana");

        // Mostrar el nombre y edad de dos personas después del cambio
        System.out.println("\nDespués del cambio: ");
        System.out.println("Persona 1: Nombre: " + personas[1].getNombre() + ", Edad: " + personas[1].getEdad());
        System.out.println("Persona 2: Nombre: " + personas[2].getNombre() + ", Edad: " + personas[2].getEdad());

        // Recorrer el vector y mostrar por pantalla únicamente a las personas cuya edad sea mayor de 30 años
        System.out.println("\nPersonas mayores de 30:");
        for (Persona persona : personas) {
            if (persona.getEdad() > 30) {
                System.out.println("Nombre: " + persona.getNombre() + ", Edad: " + persona.getEdad());
            }
        }



    }
}
