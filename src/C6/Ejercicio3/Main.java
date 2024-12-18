package C6.Ejercicio3;

public class Main {
    public static void main(String[] args) {
        VectorDatos vectorDatos = new VectorDatos(5);

        vectorDatos.agregarDato("Dato 1");
        vectorDatos.agregarDato("Dato 2");
        vectorDatos.agregarDato("Dato 3");

        System.out.println(vectorDatos.obtenerDato(1)); // Debería imprimir "Dato 2"
        System.out.println(vectorDatos.obtenerDato(5)); // Debería imprimir el mensaje de error
    }
}