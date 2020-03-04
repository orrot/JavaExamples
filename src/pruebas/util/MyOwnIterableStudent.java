package pruebas.util;

import domain.Estudiante;

import java.util.Iterator;
import java.util.List;

public class MyOwnIterableStudent implements Iterable<String> {

    private List<Estudiante> estudiantes;

    public MyOwnIterableStudent(List<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }

    @Override
    public Iterator<String> iterator() {
        return estudiantes.stream()
                .map(Estudiante::getNombre)
                .iterator();
    }
}
