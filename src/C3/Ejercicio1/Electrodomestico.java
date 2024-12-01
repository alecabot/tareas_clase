package C3.Ejercicio1;

public class Electrodomestico {
    private String marca;
    private String modelo;
    private int consumoEnergetico;

    public Electrodomestico() {

    }

    public Electrodomestico(String marca, String modelo, int consumoEnergetico) {
        this.marca = marca;
        this.modelo = modelo;
        this.consumoEnergetico = consumoEnergetico;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(int consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }
}
