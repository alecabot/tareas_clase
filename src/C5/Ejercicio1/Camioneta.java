package C5.Ejercicio1;

import java.time.LocalDate;

public class Camioneta extends Vehiculo implements Combustion{
    private Integer capacidadTanque;
    private Integer consumoCombustible;

    public Camioneta(Integer id, String placa, String modelo, Integer anio, Double costo, Integer capacidadTanque, Integer consumoCombustible) {
        super(id, placa, modelo, anio, costo);
        this.capacidadTanque = capacidadTanque;
        this.consumoCombustible = consumoCombustible;
    }

    @Override
    public void recargarCombustible() {
        System.out.println("Recargando combustible de la camioneta");
    }

    @Override
    public Integer calcularAntiguedad() {
        return LocalDate.now().getYear() - getAnio();
    }


}
