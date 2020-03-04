package domain;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Estudiante {

    public enum Grado {

        NOVENO, DECIMO, ONCE;
    }

    private String id;
    private String nombre;
    private int edad;
    private Grado grado;
    private Set<MateriaMatriculada> materiasMatriculadas = new HashSet<>();

    public Estudiante(String id, String nombre, int edad, Grado grado) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.grado = grado;
    }

    public boolean esDeNoveno() {
        return esDe(Grado.NOVENO);
    }

    public boolean esDeDecimo() {
        return esDe(Grado.DECIMO);
    }

    public boolean esDeOnce() {
        return esDe(Grado.ONCE);
    }

    private boolean esDe(Grado grado) {
        return this.grado.equals(grado);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Grado getGrado() {
        return grado;
    }

    public void setGrado(Grado grado) {
        this.grado = grado;
    }

    public Set<MateriaMatriculada> getMateriasMatriculadas() {
        return materiasMatriculadas;
    }

    public void setMateriasMatriculadas(Set<MateriaMatriculada> materiasMatriculadas) {
        this.materiasMatriculadas.addAll(materiasMatriculadas);
    }

    public String toString() {
        return new StringBuilder().append("{")
                .append(nombre).append(", ")
                .append(edad).append(", ")
                .append(grado)
                .append("}")
                .toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Estudiante)) return false;
        Estudiante that = (Estudiante) o;
        return getId().equals(that.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

}