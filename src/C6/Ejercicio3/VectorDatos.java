package C6.Ejercicio3;

public class VectorDatos {
    private String[] vector;
    private int size;
    private int currentIndex;

    public VectorDatos(int size) {
        this.size = size;
        this.vector = new String[size];
        this.currentIndex = 0;
    }

    public void agregarDato(String dato) {
        if (currentIndex < size) {
            vector[currentIndex] = dato;
            currentIndex++;
        } else {
            System.out.println("El vector está lleno. No se puede agregar más datos.");
        }
    }

    public String obtenerDato(int index) {
        try {
            return vector[index];
        } catch (ArrayIndexOutOfBoundsException e) {
            return "Error: Intentando acceder a una posición inválida en el vector.";
        }
    }
}