package domain;

import java.util.Objects;

public class Materia {

    private String codigo;
    private String nombre;

    public Materia(String codigo, String nombre) {

        Objects.requireNonNull(codigo, "El código de la materia no puede ser nulo");
        Objects.requireNonNull(codigo, "El nombre de la materia no puede ser nulo");
        this.codigo = codigo;
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Materia)) return false;
        Materia materia = (Materia) o;
        return getCodigo().equals(materia.getCodigo());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCodigo());
    }

    @Override
    public String toString() {
        return "Materia{" +
                "codigo='" + codigo + '\'' +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
