package pruebas.mock;

import domain.Estudiante;
import domain.Materia;
import domain.MateriaMatriculada;
import pruebas.exception.GeneracionDatosException;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class GeneradorDatos {

    public static final List<Materia> MATERIAS = Arrays.asList(generarMateria("M1", "Matemáticas"),
            generarMateria("M2", "Lenguaje"),
            generarMateria("M3", "Física"),
            generarMateria("M4", "Química"),
            generarMateria("M5", "Ética"));
    public static final String SEPARADOR = ",";

    private GeneradorDatos() {
    }

    public static List<Estudiante> generarEstudiantes() {

        List<Estudiante> estudiantes = new ArrayList<>(20);
        estudiantes.add(generarEstudiante("1", "Manuel Felipe Diaz", 15, Estudiante.Grado.NOVENO));
        estudiantes.add(generarEstudiante("2", "Luis Trujillo", 18, Estudiante.Grado.ONCE, "M1,4.2", "M2,4.5", "M3, 4.1", "M4,3.9"));
        estudiantes.add(generarEstudiante("3", "Naruto Usumaki", 16, Estudiante.Grado.DECIMO, "M1,4.0", "M2,3.5"));
        estudiantes.add(generarEstudiante("4", "Sasuke Uchija", 14, Estudiante.Grado.DECIMO,"M1,3.2"));
        estudiantes.add(generarEstudiante("5", "Kakaroto de Jesus", 15, Estudiante.Grado.DECIMO, "M2,4.5", "M3,2.9", "M4,5.0"));
        estudiantes.add(generarEstudiante("6", "Mikasa Acherman", 13, Estudiante.Grado.NOVENO, "M1,4.2"));
        estudiantes.add(generarEstudiante("7", "Levi Acherman", 19, Estudiante.Grado.ONCE, "M1,2.2", "M3,2.5"));
        estudiantes.add(generarEstudiante("8", "Eren Jaeger ", 13, Estudiante.Grado.NOVENO, "M2,3.2", "M4,1.8"));
        estudiantes.add(generarEstudiante("9", "Lelouch Lamperouge", 14, Estudiante.Grado.NOVENO, "M1,3.5", "M4,4.2"));
        estudiantes.add(generarEstudiante("10", "Mike Wheeler", 12, Estudiante.Grado.NOVENO));
        estudiantes.add(generarEstudiante("11", "Nancy Wheeler", 19, Estudiante.Grado.ONCE, "M2,4.8", "M3,5"));
        return estudiantes;
    }

    private static Estudiante generarEstudiante(String id, String nombre, int edad, Estudiante.Grado grado, String ... materiaNotas) {
        Estudiante estudiante = new Estudiante(id, nombre, edad, grado);
        if (materiaNotas != null && materiaNotas.length > 0) {

            Set<MateriaMatriculada> materiasMatriculadas = Arrays.stream(materiaNotas)
                    .map(datosSeparadosPorComa -> generarMateriaMatriculada(datosSeparadosPorComa))
                    .collect(Collectors.toSet());
            estudiante.setMateriasMatriculadas(materiasMatriculadas);
        }
        return estudiante;
    }

    public static MateriaMatriculada generarMateriaMatriculada(String datosSeparadosPorComa) {
        String[] datos = datosSeparadosPorComa.split(SEPARADOR);
        Materia materia = buscarMateriaPorCodigo(datos[0].trim());
        BigDecimal nota = new BigDecimal(datos[1].trim());
        return new MateriaMatriculada(materia, nota);
    }

    public static Materia buscarMateriaPorCodigo(String codigoMateria) {
        return MATERIAS.stream()
                .filter(materia -> materia.getCodigo().equals(codigoMateria))
                .findFirst()
                .orElseThrow(() -> new GeneracionDatosException("No se encontró la materia de código " + codigoMateria));
    }

    public static Materia generarMateria(String codigo, String nombre) {
        return new Materia(codigo, nombre);
    }

}
