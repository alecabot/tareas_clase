package C5.Ejercicio2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Producto> productos = new ArrayList<>();

        productos.add(new Producto("P001", "Teléfono", "Samsung", "Electrónica", 300.0, 500.0, 50));
        productos.add(new Producto("P002", "Laptop", "Dell", "Electrónica", 800.0, 1200.0, 30));
        productos.add(new Producto("P003", "Auriculares", "Sony", "Accesorios", 50.0, 100.0, 100));
        productos.add(new Producto("P004", "Cargador", "Anker", "Accesorios", 20.0, 40.0, 200));
        productos.add(new Producto("P005", "Tablet", "Apple", "Electrónica", 400.0, 700.0, 25));
        productos.add(new Producto("P006", "Monitor", "LG", "Electrónica", 150.0, 250.0, 40));
        productos.add(new Producto("P007", "Teclado", "Logitech", "Accesorios", 30.0, 60.0, 150));
        productos.add(new Producto("P008", "Mouse", "Razer", "Accesorios", 25.0, 50.0, 180));
        productos.add(new Producto("P009", "Impresora", "HP", "Electrónica", 100.0, 200.0, 35));
        productos.add(new Producto("P010", "Cámara", "Canon", "Electrónica", 500.0, 800.0, 20));

        Producto productoMayorPrecioVenta = productos.get(0);
        Producto productoMenorPrecioCosto = productos.get(0);
        Producto productoEliminado = productos.remove(5);
        Producto productoMayorCantidadStock = productos.get(0);


        for (Producto producto : productos) {
            if (producto.getPrecioVenta() > productoMayorPrecioVenta.getPrecioVenta()){
                productoMayorPrecioVenta = producto;
            }
            if (producto.getPrecioVenta() < productoMayorPrecioVenta.getPrecioVenta()){
                productoMayorPrecioVenta = producto;
            }
            if (producto.getCantidadEnStock() > productoMayorPrecioVenta.getCantidadEnStock()){
                productoMayorCantidadStock = producto;
            }

        }

        productoMayorCantidadStock.setCantidadEnStock(productoMayorPrecioVenta.getCantidadEnStock() - 3);



        System.out.println("El producto con el mayor precio de venta es " + productoMayorPrecioVenta.getNombre());
        System.out.println("El producto con el menor costo es: " + productoMenorPrecioCosto.getNombre());
        System.out.println("Se ha borrado el producto: " + productoEliminado.getNombre() + " que estaba en la posicion 5");
        for (int i = 0; i < productos.size(); i++) {
            if (productos.get(i).getCantidadEnStock() == productoMayorCantidadStock.getCantidadEnStock()){
                productos.set(i, productoMayorCantidadStock);
                System.out.println("Se desconto a -3 unidades la cantidad de stock del producto: " + productos.get(i).getNombre());
            }

        }

    }
}
