package C4.Ejercicio2;

public class Zapato extends Vestimenta {
    private String material;
    private String tipoCierre;

    public Zapato(int codigo, String nombre, double precio, String marca, String talla, String color, String material, String tipoCierre) {
        super(codigo, nombre, precio, marca, talla, color);
        this.material = material;
        this.tipoCierre = tipoCierre;
    }

    @Override
    public void mostrarVestimenta() {
        System.out.println("Estos zapatos son de marca: " + getMarca());
    }



}
