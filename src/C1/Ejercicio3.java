package C1;

/*
Escribe un programa que permita calcular el área de un triángulo y luego mostrar el resultado por pantalla.
Recuerda que la fórmula para calcular esto es: (base * altura) / 2 (base por altura dividido entre dos)

Pista: Debes declarar variables para la base y la altura del triángulo, asignarle valores y luego calcular el área utilizando la fórmula.
 */

public class Ejercicio3 {
    public static void main(String[] args) {

        // Declaración de variables para la base y la altura del triángulo
        double base = 16;
        double altura = 12;

        // Cálculo del área del triángulo utilizando la fórmula (base * altura) / 2
        double area = (base * altura) / 2;

        // Mostrar el resultado del área del triángulo por pantalla
        System.out.println("El área del triángulo es: " + area);
    }
}