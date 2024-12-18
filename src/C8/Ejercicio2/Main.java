package C8.Ejercicio2;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Evento> eventos = Arrays.asList(
                new Evento("Reunión de equipo", LocalDate.of(2023, 11, 15), "Reunión"),
                new Evento("Conferencia de tecnología", LocalDate.of(2023, 12, 1), "Conferencia"),
                new Evento("Taller de programación", LocalDate.of(2023, 12, 10), "Taller"),
                new Evento("Reunión de planificación", LocalDate.of(2024, 1, 5), "Reunión"),
                new Evento("Conferencia de seguridad", LocalDate.of(2024, 2, 20), "Conferencia"),
                new Evento("Taller de diseño", LocalDate.of(2024, 3, 15), "Taller"),
                new Evento("Reunión de seguimiento", LocalDate.of(2024, 4, 10), "Reunión"),
                new Evento("Conferencia de innovación", LocalDate.of(2024, 5, 25), "Conferencia"),
                new Evento("Taller de liderazgo", LocalDate.of(2024, 6, 5), "Taller")
        );

        System.out.println("1. Filtra los eventos que están programados para una fecha específica..");

        eventos.stream()
                .filter(evento -> evento.getFecha().equals(LocalDate.of(2024, 3, 15)))
                .forEach(System.out::println);

        System.out.println("\n2. Agrupa los eventos por categoría y cuenta cuántos eventos hay en cada categoría.");
        eventos.stream()
                .collect(Collectors.groupingBy(
                        Evento::getCategoria,
                        Collectors.counting()
                        ))
                .forEach((clave, valor) -> System.out.println("Categoria: " + clave + " numero de eventos: " + valor) );

        System.out.println("\n3. Encuentra el evento más próximo en el tiempo utilizando Optionals.");
        eventos.stream()
                .min(Comparator.comparing(Evento::getFecha))
                .ifPresentOrElse(
                        evento -> System.out.println("el evento mas proximo es el " + evento.getFecha()),
                        () -> System.out.println("no se encontro el evento mas proximo")
                        );



        System.out.println("\n Prueba.");

    }
}
