package pruebas.operations.terminal;

import domain.Estudiante;
import pruebas.mock.GeneradorDatos;
import pruebas.util.Impresora;

import java.util.Iterator;

public class TerminalOperationNotEagerSpecials {

    public static void main(String[] args) {

        // Iterator y Spliterator SON LAZY
        Iterator<Estudiante> estudiantesDecimo = GeneradorDatos.generarEstudiantes()
                .stream()
                .filter(estudiante -> Estudiante.Grado.DECIMO.equals(estudiante.getGrado()))
                .peek(System.out::println)
                .iterator();

        Impresora.imprimir("ESTUDIANTES DE DECIMO", estudiantesDecimo);
    }
}
