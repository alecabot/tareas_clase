package C6.Ejercicio2;

import java.util.ArrayList;
import java.util.List;

public class Inventario {
    private List<Producto> productos;

    public Inventario(){
        this.productos = new ArrayList<>();
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void agregarProducto(Producto producto) throws inventarioException {
        if (producto.getNombreProducto() == null || producto.getPrecio() == null || producto.getCantidad() == null){
            throw new inventarioException("faltan datos en el producto");
        }

        if (producto.getPrecio() < 0){
            throw new inventarioException("no se puede ingresar producto con precio negativo");
        }
        productos.add(producto);

    }
}
