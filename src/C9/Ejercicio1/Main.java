package C9.Ejercicio1;

import java.util.Random;

public class Main {

    private static final String[] MARCAS = {"Toyota", "Honda", "Ford", "Chevrolet", "Nissan"};
    private static final String[] MODELOS = {"Corolla", "Civic", "Focus", "Malibu", "Altima"};
    private static final String[] ANIOS = {"2018", "2019", "2020", "2021", "2022"};
    private static final double[] PRECIOS = {15000.0, 18000.0, 20000.0, 22000.0, 25000.0};

    public static void main(String[] args) {

        Random random = new Random();
        InventarioAuto<Auto> inventarioAuto = new InventarioAuto<>();

        for (int i = 0; i < 10; i++) {
            Auto auto = generarAutoAleatorio(random);
            inventarioAuto.agregarAutos(auto);
        }

        System.out.println("Buscar por marca 'Toyota':");
        inventarioAuto.buscarPorMarca("Toyota").forEach(auto ->
                System.out.println(auto.getMarca() + " " + auto.getModelo() + " " + auto.getAnio() + " " + auto.getPrecio())
        );

        System.out.println("\nBuscar por año '2019':");
        inventarioAuto.buscarPorAnio("2019").forEach(auto ->
                System.out.println(auto.getMarca() + " " + auto.getModelo() + " " + auto.getAnio() + " " + auto.getPrecio())
        );

        System.out.println("la suma total de todos los precio de los autos es = " + inventarioAuto.TotalAutos());


    }

    private static Auto generarAutoAleatorio(Random random) {
        String marca = MARCAS[random.nextInt(MARCAS.length)];
        String modelo = MODELOS[random.nextInt(MODELOS.length)];
        String anio = ANIOS[random.nextInt(ANIOS.length)];
        double precio = PRECIOS[random.nextInt(PRECIOS.length)];
        return new Auto(marca, modelo, anio, precio);
    }
}
