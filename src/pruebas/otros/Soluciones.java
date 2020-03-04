package pruebas.otros;

import domain.Estudiante;
import pruebas.mock.GeneradorDatos;
import pruebas.util.Impresora;

import java.util.List;
import java.util.stream.Collectors;

public class Soluciones {

    public static List<Estudiante> generarEstudiantes() {

        List<Estudiante> estudiantes = GeneradorDatos.generarEstudiantes();
        return estudiantes;
    }

    public static void main(String[] args) {

        List<Estudiante> estudiantes = generarEstudiantes();

        // Ejercicio 1
        // Hallar los estudiantes mayores de edad
        List<Estudiante> estudiantesMayoresEdad = estudiantes
                .stream()
                .filter(estudiante -> estudiante.getEdad() >= 18)
                .sorted()
                .collect(Collectors.toList());
        Impresora.imprimir("ESTUDIANTES MAYORES DE EDAD", estudiantesMayoresEdad);

/*
        // Ejercicio 2
        // Hallar el promedio de edad de todos los estudiantes
        double promedioEdadEstudiantes = estudiantes
                .stream()
                .mapToInt(Estudiante::getEdad)
                .average()
                .getAsDouble();

        Impresora.imprimir("PROMEDIO DE EDAD E TODOS", promedioEdadEstudiantes);

        // Ejercicio 3
        // Obtener el listado de estudiantes de Once

        List<Estudiante> estudiantesDeOnce = estudiantes
                .stream()
                .filter(estudiante -> Estudiante.Grado.ONCE.equals(estudiante.getGrado()))
                .collect(Collectors.toList());
        Impresora.imprimir("ESTUDIANTES DE ONCE", estudiantesDeOnce);

        // Ejercicio 4
        // Hallar los estudiantes de noveno por edad Y dentro de edad por nombre
        List<Estudiante> estudiantesNovenoOrdenados = estudiantes
                .stream()
                .filter(estudiante -> Estudiante.Grado.NOVENO.equals(estudiante.getGrado()))
                .sorted(Comparator.comparing(Estudiante::getEdad)
                        .thenComparing(Estudiante::getNombre))
                .collect(Collectors.toList());
        Impresora.imprimir("ESTUDIANTES DE NOVENO POR EDAD ORDENADOS", estudiantesNovenoOrdenados);

        // Ejercicio 6
        // Obtener el listado de nombres de todos los estudiantes de once ordenados alfabeticamente
        String listadoNombresOnce = estudiantes
                .stream()
                .filter(estudiante -> Estudiante.Grado.ONCE.equals(estudiante.getGrado()))
                .map(Estudiante::getNombre)
                .sorted()
                .collect(Collectors.joining(", "));
        Impresora.imprimir("LISTADO DE ESTUDIANTES DE ONCE", listadoNombresOnce);

        // Ejercicio 6
        // Agrupar los estudiantes de acuerdo a su grado
        Map<Estudiante.Grado, List<Estudiante>> estudiantesAgrupadosPorGrado = estudiantes
                .stream()
                .collect(Collectors.groupingBy(Estudiante::getGrado));
        Impresora.imprimir("ESTUDIANTES POR GRADO", estudiantesAgrupadosPorGrado);

        // Ejercicio 7
        // Agrupar los nombres de los estudiantes de acuerdo a su grado
        Map<Estudiante.Grado, String> nombresPorGrado = estudiantes
                .stream()
                .collect(Collectors.groupingBy(Estudiante::getGrado, Collectors.reducing("", Estudiante::getNombre, (a, b) -> a.isEmpty()? b: a.concat(", ").concat(b))));
        Impresora.imprimir("NOMBRES DE ESTUDIANTES POR GRADO", nombresPorGrado);


        // Ejercicio 8
        // Obtener el listado de estudiantes divididos entre mayores y menores de edad
        Map<Boolean, List<Estudiante>> estudiantesParticionadosPorEdad = estudiantes
                .stream()
                .collect(Collectors.partitioningBy((Estudiante estudiante) -> estudiante.getEdad() >= 18));
        Impresora.imprimir("ESTUDIANTES PARTICIONADOS", estudiantesParticionadosPorEdad);

        // Ejercicio 9
        // Hallar el promedio de edad de todos los estudiantes por grado
        Map<Estudiante.Grado, Double> gradosPromediosEdades = estudiantes
                .stream()
                .collect(Collectors.groupingBy(Estudiante::getGrado, Collectors.averagingDouble(Estudiante::getEdad)));
        Impresora.imprimir("PROMEDIOS DE EDADES POR GRADO", gradosPromediosEdades);


 */
    }
}