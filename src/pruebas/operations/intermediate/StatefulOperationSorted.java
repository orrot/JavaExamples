package pruebas.operations.intermediate;

import domain.Estudiante;
import pruebas.mock.GeneradorDatos;
import pruebas.util.Impresora;

import java.util.Comparator;
import java.util.List;

public class StatefulOperationSorted {

    public static void main(String[] args) {

        List<Estudiante> estudiantes = GeneradorDatos.generarEstudiantes().subList(0,3);

        // Calculando promedio. Viendo la implicación que tiene el sorted sobre un Stream.

        Impresora.imprimir("EJEMPLO DE UNA INTERMEDIA STATEFULL OPERATION");

        Double promedioEdad = estudiantes.stream()
                .peek(estudiante -> System.out.println("PEEK SORTED 1: " + estudiante.toString()))
                .sorted(Comparator.comparing(Estudiante::getNombre))
                .mapToInt(Estudiante::getEdad)
                .peek(edad -> System.out.println("PEEK SORTED 2: " + edad))
                .average()
                .orElse(0);

        Impresora.imprimirDosLineas();

        Impresora.imprimir("EJEMPLO DE UNA STATEFULL OPERATION");
        // Promedio de edad
        promedioEdad = estudiantes.stream()
                .peek(e -> System.out.println("PEEK WITHOUT SORTED 1: " + e.toString()))
                .mapToInt(Estudiante::getEdad)
                .peek(edad -> System.out.println("PEEK WITHOUT SORTED 2: " + edad))
                .average()
                .orElse(0);
    }
}
