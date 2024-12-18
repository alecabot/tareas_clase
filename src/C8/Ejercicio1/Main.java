package C8.Ejercicio1;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        ArrayList<Empleado> empleados = new ArrayList<>(Arrays.asList(
                new Empleado("Alberto", 50000, "Desarrollador"),
                new Empleado("Juan", 60000, "Desarrollador"),
                new Empleado("Ana", 60000, "Analista"),
                new Empleado("Pepe", 40000, "Analista"),
                new Empleado("Pedro", 40000, "Gerente"),
                new Empleado("Jose", 70000, "Gerente")
        ));

        //filtrar por salario

        System.out.println("Salario mayor a 50000");
        empleados.stream()
                .filter(empleado -> empleado.getSalario() > 50000)
                .forEach(System.out::println);

        // agrupar por categoria y calcular salario promedio

        System.out.println("\nagrupar por categoria y calcular salario medio");

        empleados.stream()
                .collect(Collectors.groupingBy(
                        Empleado::getCategoria,
                        Collectors.averagingDouble(Empleado::getSalario)
                )).forEach((clave, valor) -> System.out.println("Categoría: " + clave + ", Salario Medio: " + valor));


//        for (Map.Entry<String, Double> valor : salarioMedio.entrySet()) {
//            System.out.println("Categoría: " + valor.getKey() + ", Salario Total: " + valor.getValue());
//        }
        System.out.println("\nempleado con el salario mas alto");
        empleados.stream()
                .max(Comparator.comparing(Empleado::getSalario))
                .ifPresentOrElse(
                        empleado -> System.out.println(empleado.getNombre() + "tiene el  salario mas alto y es: " + empleado.getSalario()),
                        () -> System.out.println("no se encontro el salario mas alto")

                );


        System.out.println("prueba");
        empleados.stream()
                .collect(Collectors.groupingBy(Empleado::getCategoria))
                .forEach((categoria, lista) -> {
                    Double salarioMedio = lista.stream()
                            .mapToDouble(Empleado::getSalario)
                            .average()
                            .orElse(0.0);
                    List<String> nombres = lista.stream()
                            .map(Empleado::getNombre)
                            .toList();
                    System.out.println("Categoría: " + categoria + ", Salario Medio: " + salarioMedio + ", Nombres: " + String.join(", ", nombres));

                });
//        empleadoPromedioAlto.entrySet().stream().max(Comparator.comparing(Map.Entry::getValue)).ifPresent(stringDoubleEntry -> System.out.println(stringDoubleEntry.getValue()));
//        Map<String, Double> promedioDePromedios = empleadoPromedioAlto.entrySet().stream().collect(Map.Entry::getKey,Collectors.averagingDouble(Double::doubleValue));
//        System.out.println(promedioDePromedios);






    }
}
