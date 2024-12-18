package C5.Ejercicio1;

import java.time.LocalDate;

public class Moto extends Vehiculo implements Combustion{
    private Integer cilindrada;
    private Integer tipoMotor;

    public Moto(Integer id, String placa, String modelo, Integer anio, Double costo, Integer cilindrada, Integer tipoMotor) {
        super(id, placa, modelo, anio, costo);
        this.cilindrada = cilindrada;
        this.tipoMotor = tipoMotor;
    }

    @Override
    public void recargarCombustible() {
        System.out.println("Recargando combustible de la moto");
    }

    @Override
    public Integer calcularAntiguedad() {
        return LocalDate.now().getYear() - getAnio();
    }

}
