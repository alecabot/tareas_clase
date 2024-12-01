package C3.Ejercicio1;

public class Main {
    /*
    Ejercicio N.º1 - Clases y Objetos - Individual
    Crear una clase llamada Electrodomestico (sin tilde, recuerda que los nombres de clases y variables no llevan tilde) con los siguientes atributos: cod, marca, modelo, consumo y color.
    Luego, realiza las siguientes acciones:
    a) Crea 3 objetos de la clase Electrodomestico utilizando parámetros.
    b) Crea 1 objeto de la clase Electrodomestico sin parámetros.
    c) Muestra por pantalla la marca, modelo y consumo energético de los 3 electrodomésticos creados con parámetros.
    d) Intenta obtener la marca del electrodoméstico creado sin parámetros. ¿Se obtiene algún valor? De ser así… ¿Qué valor se obtiene?
     */
    public static void main(String[] args) {

        // Crear 3 objetos de la clase Electrodomestico utilizando parámetros
        Electrodomestico electro1 = new Electrodomestico("Samsung", "ModelA", 100);
        Electrodomestico electro2 = new Electrodomestico("LG", "ModelB", 150);
        Electrodomestico electro3 = new Electrodomestico("Sony", "ModelC", 200);

        // Crear un array de Electrodomestico y almacenar los objetos creados
        Electrodomestico[] electrodomesticos = {electro1, electro2, electro3};

        // Recorrer el array y mostrar por pantalla la marca, modelo y consumo energético de cada electrodoméstico
        for (Electrodomestico electrodomestico : electrodomesticos) {
            System.out.println(
                    "Marca: " + electrodomestico.getMarca() +
                            " Modelo: " + electrodomestico.getModelo() +
                            " Consumo eléctrico: " + electrodomestico.getConsumoEnergetico());
        }

        // Crear un objeto de la clase Electrodomestico sin parámetros
        Electrodomestico electro4 = new Electrodomestico();

        // Intentar obtener la marca del electrodoméstico creado sin parámetros
        // Devolvería un valor nulo, ya que no se le asignó ningún valor a ese atributo en el constructor
        System.out.println("Marca del electrodoméstico creado sin parámetros: " + electro4.getMarca());


    }
}
