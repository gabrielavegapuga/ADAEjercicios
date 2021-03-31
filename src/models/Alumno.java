package models;

public class Alumno extends Persona {

    private int codigoEstudiante;
    private String curso;

    public Alumno(String nombre, String apellido, int dni, int codigoEstudiante, String curso) {
        super(nombre, apellido, dni);
        this.codigoEstudiante=codigoEstudiante;
        this.curso=curso;
    }

    @Override
    public String toString() {
        return "Alumno{" + getNombre() + " " + getApellido() + ", DNI: " + getDni() +
                " codigoEstudiante=" + codigoEstudiante +
                ", curso='" + curso + '\'' +
                '}';
    }

    public int getCodigoEstudiante() {
        return codigoEstudiante;
    }

    public void setCodigoEstudiante(int codigoEstudiante) {
        this.codigoEstudiante = codigoEstudiante;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}
