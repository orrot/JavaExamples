package pruebas.spliterator;

import domain.Estudiante;
import pruebas.mock.GeneradorDatos;
import pruebas.util.Impresora;
import pruebas.util.MyOwnIterableStudent;

import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;

public class IteratorVsSpliterator {

    public static void main(String[] args) {

        List<Estudiante> estudiantes = GeneradorDatos.generarEstudiantes();

        forEachClasico(estudiantes);

        //forEachIteradorCustom(estudiantes);

        //iteradorManual(estudiantes);

        //spliteratorTryAdvance(estudiantes);

        //spliteratorForEachRemaining(estudiantes);

    }

    private static void forEachClasico(List<Estudiante> estudiantes) {
        Impresora.imprimirTitulo("FOR EACH CLÁSICO");
        for (Estudiante estudiante: estudiantes) {
            System.out.println(estudiante);
        }
    }

    private static void forEachIteradorCustom(List<Estudiante> estudiantes) {
        Impresora.imprimirTitulo("EL FOR EACH PUEDE USAR EL ITERATOR DE LAS COLECCIONES");
        MyOwnIterableStudent myOwnIterableStudent = new MyOwnIterableStudent(estudiantes);
        for (String nombre: myOwnIterableStudent) {
            System.out.println(nombre);
        }
    }

    private static void iteradorManual(List<Estudiante> estudiantes) {
        Impresora.imprimirTitulo("EL ITERATOR HECHO MANUALMENTE");
        Iterator<Estudiante> estudianteIterator = estudiantes.iterator();
        while (estudianteIterator.hasNext()) {
            System.out.println(estudianteIterator.next());
        }
    }

    private static void spliteratorTryAdvance(List<Estudiante> estudiantes) {
        Impresora.imprimirTitulo("SPLITERATOR TRY TO ADVANCE");
        Spliterator<Estudiante> spliterator = estudiantes.spliterator();
        while (spliterator.tryAdvance(System.out::println));
    }

    private static void spliteratorForEachRemaining(List<Estudiante> estudiantes) {
        Impresora.imprimirTitulo("SPLITERATOR FOR EACH REMAINING");
        Spliterator<Estudiante> spliterator = estudiantes.spliterator();
        spliterator.forEachRemaining(System.out::println);
    }



}
