package C6.Ejercicio1;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Vuelo vuelo = new Vuelo("Barcelona", LocalDate.of(2024,11, 22),20);
        Reserva reserva = new Reserva("alejandro", LocalDate.now(), 4);
        try {
            vuelo.reservarVuelo(reserva);
            System.out.println("vuelo a " + vuelo.getDestino() + " reservado correctamente");
        } catch (ReservaInvalidaException e) {
            System.out.println("se produjo un error al reservar vuelo -> " + e.getMessage());;
        }finally {
            System.out.println("el numero de asientos disponibles es de: " + vuelo.getAsientosDisponibles());
        }
    }
}
