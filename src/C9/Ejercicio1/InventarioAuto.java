package C9.Ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class InventarioAuto<T extends Auto>{
    private List<T> inventarioAuto;

    public InventarioAuto() {
        inventarioAuto = new ArrayList<>();
    }

    public void agregarAutos(T auto){
        inventarioAuto.add(auto);
    }

    public List<T> buscarPorMarca(String marca){
        return inventarioAuto.stream()
                .filter(auto -> auto.getMarca().equalsIgnoreCase(marca))
                .toList();
    }

    public List<T> buscarPorAnio(String anio){
        return inventarioAuto.stream()
                .filter(auto -> auto.getAnio().equalsIgnoreCase(anio))
                .toList();
    }

    public Double TotalAutos(){
        return inventarioAuto.stream()
                .mapToDouble(Auto::getPrecio)
                .sum();
    }
}
