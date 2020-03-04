package domain;

import java.math.BigDecimal;
import java.util.Objects;

public class MateriaMatriculada {

    private Materia materia;
    private BigDecimal nota;

    public MateriaMatriculada(Materia materia) {

        this(materia, BigDecimal.ZERO);
    }
    public MateriaMatriculada(Materia materia, BigDecimal nota) {

        Objects.requireNonNull(materia, "Es obligatorio que un estudiante tenga una materia asignada");
        this.materia = materia;
        this.nota = nota;
    }

    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }

    public BigDecimal getNota() {
        return nota;
    }

    public void setNota(BigDecimal nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "MateriaMatriculada{" +
                "codigo materia=" + materia.getCodigo() +
                "nombre materia=" + materia.getNombre() +
                ", nota=" + nota +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MateriaMatriculada)) return false;
        MateriaMatriculada that = (MateriaMatriculada) o;
        return getMateria().equals(that.getMateria()) &&
                getNota().equals(that.getNota());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getMateria(), getNota());
    }
}
