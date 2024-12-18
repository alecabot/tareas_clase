package C5.Ejercicio1;

import java.time.LocalDate;

public class Auto extends Vehiculo implements Electrico{
    private Integer capacidadBateria;
    private Integer autonomia;

    public Auto(Integer id, String placa, String modelo, Integer anio, Double costo, Integer capacidadBateria, Integer autonomia) {
        super(id, placa, modelo, anio, costo);
        this.capacidadBateria = capacidadBateria;
        this.autonomia = autonomia;
    }

    @Override
    public Integer calcularAntiguedad() {
        return LocalDate.now().getYear() - getAnio();
    }

    @Override
    public void recargarEnergia() {
        System.out.println("Recargando bateria del Auto");
    }


}
