package C4.Ejercicio2;

public class Main {
    public static void main(String[] args) {
        Vestimenta[] vestimentas = new Vestimenta[9];

        vestimentas[0] = new Zapato(1, "Zapato Deportivo", 50.0, "Nike", "42", "Negro", "Cuero", "Cordones");
        vestimentas[1] = new Zapato(2, "Zapato Formal", 80.0, "Clarks", "43", "Marrón", "Cuero", "Hebilla");
        vestimentas[2] = new Zapato(3, "Zapato Casual", 60.0, "Adidas", "41", "Blanco", "Sintético", "Velcro");

        vestimentas[3] = new Pantalon(4, "Jeans", 40.0, "Levi's", "M", "Azul", "Casual", "Denim");
        vestimentas[4] = new Pantalon(5, "Pantalón de Vestir", 70.0, "Hugo Boss", "L", "Negro", "Formal", "Lana");
        vestimentas[5] = new Pantalon(6, "Pantalón Chino", 50.0, "Dockers", "M", "Beige", "Casual", "Algodón");

        vestimentas[6] = new Camiseta(7, "Camiseta Deportiva", 30.0, "Puma", "L", "Rojo", "Corta", "Redondo");
        vestimentas[7] = new Camiseta(8, "Camiseta Casual", 25.0, "Zara", "M", "Blanco", "Larga", "V");

        vestimentas[8] = new Sombrero(9, "Sombrero de Paja", 20.0, "Panama Jack", "Única", "Beige", "Fedora", "Mediano");

        // Opcional: Imprimir los detalles de cada vestimenta
        for (Vestimenta vestimenta : vestimentas) {
            vestimenta.mostrarVestimenta();
        }
    }
}