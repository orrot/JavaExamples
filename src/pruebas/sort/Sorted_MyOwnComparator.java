package pruebas.sort;

import domain.Estudiante;
import pruebas.mock.GeneradorDatos;
import pruebas.util.Impresora;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Sorted_MyOwnComparator {

    public static void main(String[] args) {

        List<Estudiante> estudiantes = GeneradorDatos.generarEstudiantes();

        // Ordenar los estudiantes de décido por grado y dentro de grado, por nombre.

        List<Estudiante> estudiantesDecimo = estudiantes.stream()
                .sorted(Comparator.comparing(Estudiante::getGrado))
                .sorted(Comparator.comparing(Estudiante::getNombre))
                .collect(Collectors.toList());

        Impresora.imprimir("Estudiantes de Decimo", estudiantesDecimo);
    }
}
