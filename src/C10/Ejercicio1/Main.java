package C10.Ejercicio1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Vehiculo> vehiculos = new ArrayList<>(Arrays.asList(
                new Vehiculo("Fiesta", "Ford", 1000.0),
                new Vehiculo("Focus", "Ford", 1200.0),
                new Vehiculo("Explorer", "Ford", 2500.0),
                new Vehiculo("Uno", "Fiat", 500.0),
                new Vehiculo("Cronos", "Fiat", 1000.0),
                new Vehiculo("Torino", "Fiat", 1250.0),
                new Vehiculo("Aveo", "Chevrolet", 1250.0),
                new Vehiculo("Spin", "Chevrolet", 2500.0),
                new Vehiculo("Corolla", "Toyota", 1200.0),
                new Vehiculo("Fortuner", "Toyota", 3000.0),
                new Vehiculo("Logan", "Renault", 950.0)
        ));



        System.out.println("vehiculos ordenada por precio: ");
        vehiculos.stream()
                .sorted(Comparator.comparing(Vehiculo::getPrecio))
                .forEach(vehiculo -> System.out.println(vehiculo));

        System.out.println("\nvehiculos ordenada por marca y precio: ");
        vehiculos.stream()
                .sorted(Comparator.comparing(Vehiculo::getMarca).thenComparing(Vehiculo::getPrecio))
                .forEach(vehiculo -> System.out.println(vehiculo));


        System.out.println("\nvehiculos precio menor a 1000: ");
        List<Vehiculo> vehiculosMenor = vehiculos.stream()
                .filter(vehiculo -> vehiculo.getPrecio() <= 1000)
                .toList();


        vehiculosMenor.forEach(vehiculo ->
                System.out.println(vehiculosMenor));

        System.out.println("\nvehiculos precio mayor a 1000: ");

        List<Vehiculo> vehiculosMayor = vehiculos.stream()
                .filter(vehiculo -> vehiculo.getPrecio() >= 1000)
                .toList();

        vehiculosMayor.forEach(vehiculo ->
                System.out.println(vehiculosMayor));


        Double promedioPrecio = vehiculos.stream()
                .mapToDouble(Vehiculo::getPrecio)
                .average()
                .orElse(0.0);
        System.out.println("\nel precio promedio de los vehiculos es = " + promedioPrecio);


    }
}
