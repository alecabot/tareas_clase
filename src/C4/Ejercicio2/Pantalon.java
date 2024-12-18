package C4.Ejercicio2;

public class Pantalon extends Vestimenta {
    private String estilo;
    private String tipoTejido;

    public Pantalon(int codigo, String nombre, double precio, String marca, String talla, String color, String estilo, String tipoTejido) {
        super(codigo, nombre, precio, marca, talla, color);
        this.estilo = estilo;
        this.tipoTejido = tipoTejido;
    }

    @Override
    public void mostrarVestimenta() {
        System.out.println("Estos pantalones son de estilo: " + estilo);
    }
}
