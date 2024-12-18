package C5.Ejercicio1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


        ArrayList<Vehiculo> vehiculos = new ArrayList<>();

        vehiculos.add(new Auto(1, "ABC123", "Tesla Model S", 2020, 80000.0, 100, 300));
        vehiculos.add(new Camioneta(2, "DEF456", "Ford F-150", 2018, 40000.0, 80, 15));
        vehiculos.add(new Moto(3, "GHI789", "Yamaha YZF-R3", 2019, 5000.0, 14, 20));

        for (Vehiculo vehiculo : vehiculos) {
            System.out.println("El vehiculo tiene una antiguedad de: " + vehiculo.calcularAntiguedad());
            if (vehiculo instanceof Auto){
                ((Auto) vehiculo).recargarEnergia();
            } else if (vehiculo instanceof Camioneta) {
                ((Camioneta) vehiculo).recargarCombustible();
            }else {
                ((Moto) vehiculo).recargarCombustible();
            }
        }
    }
}
