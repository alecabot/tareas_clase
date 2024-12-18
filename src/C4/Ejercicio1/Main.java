package C4.Ejercicio1;

public class Main {
    public static void main(String[] args) {
        Mamifero mamifero = new Mamifero(1, "León", 5, "Piel", "Carnívoro", 4, "Vivíparo", "Amarillo", "Sabana");
        Ave ave = new Ave(2, "Águila", 3, "Plumas", "Carnívoro", 2.0, "Planeador", "Marrón", "Ganchudo");
        Reptil reptil = new Reptil(3, "Serpiente", 2, "Escamas", "Carnívoro", 1.5, "Lisas", "Neurotóxico", "Selva");

        mamifero.saludar();
        ave.saludar();
        reptil.saludar();

        Animal animal = mamifero; // Esto es posible debido a la herencia

        animal.saludar();
    }
}
