package pruebas.sort;

import domain.Estudiante;
import pruebas.mock.GeneradorDatos;
import pruebas.util.Impresora;

import java.util.ArrayList;
import java.util.List;

public class Sorted_NaturalOrderWithEstudiante {

    public static void main(String[] args) {

        List<Estudiante> estudiantes = GeneradorDatos.generarEstudiantes();

        List<Estudiante> estudiantesDecimo = estudiantes.stream()
                .filter(Estudiante::esDeNoveno)
                //.sorted()
                .collect(ArrayList::new, (list, e) -> list.add(e), (list1, list2) -> list1.addAll(list2));

        Impresora.imprimir("Estudiantes de Decimo", estudiantesDecimo);
    }
}
