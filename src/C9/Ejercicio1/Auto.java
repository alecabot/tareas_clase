package C9.Ejercicio1;

public class Auto {
    private String marca;
    private String modelo;
    private String anio;
    private Double precio;

    public Auto(String marca, String modelo, String anio, Double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getAnio() {
        return anio;
    }

    public Double getPrecio() {
        return precio;
    }
}
