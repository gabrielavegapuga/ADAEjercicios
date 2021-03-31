package interfaces;

import models.Alumno;

import java.util.List;

public interface EliminarClases {
    List<Alumno> eliminarAlumnoConCursoUnico(List<Alumno> alumnos, String curso);

    List<Alumno> eliminarAlumnosConCurso(List<Alumno> alumnos, Alumno alumno);

    List<Alumno> eliminarListaDeAlumnosConCurso(List<Alumno> alumnos, List<Alumno> alumnosB);
}
