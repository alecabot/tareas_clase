package C6.Ejercicio2;

public class Main {
    public static void main(String[] args) {
        Producto producto = new Producto("Lavadora", 18.8, 19);

        Inventario inventario = new Inventario();

        try {
            inventario.agregarProducto(producto);
        } catch (inventarioException e) {
            System.out.println("Error al agregar producto -> " + e.getMessage());
        }finally {
            System.out.println("productos en el inventario: ");
            for (Producto producto1 : inventario.getProductos()){
                System.out.println(producto1);
            }
        }
    }
}
