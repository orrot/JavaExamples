package pruebas.operations.terminal;

import domain.Estudiante;
import pruebas.mock.GeneradorDatos;
import pruebas.util.Impresora;

import java.util.List;
import java.util.stream.Collectors;

public class TerminalOperationEagersByDefault {

    public static void main(String[] args) {

        List<Estudiante> estudiantesDecimo = GeneradorDatos.generarEstudiantes()
                .stream()
                .filter(estudiante -> Estudiante.Grado.DECIMO.equals(estudiante.getGrado()))
                .peek(System.out::println)
                .collect(Collectors.toList());

        Impresora.imprimir("ESTUDIANTES DE DECIMO", estudiantesDecimo);
    }
}
