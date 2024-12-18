package C5.Ejercicio1;

public abstract class Vehiculo{
    private Integer id;
    private String placa;
    private String modelo;
    private Integer anio;
    private Double costo;

    public Vehiculo(Integer id, String placa, String modelo, Integer anio, Double costo) {
        this.id = id;
        this.placa = placa;
        this.modelo = modelo;
        this.anio = anio;
        this.costo = costo;
    }

    public Integer getAnio() {
        return anio;
    }

    public abstract Integer calcularAntiguedad();
}
