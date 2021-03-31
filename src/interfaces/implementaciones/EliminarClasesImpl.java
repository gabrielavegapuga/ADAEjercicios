package interfaces.implementaciones;

import interfaces.EliminarClases;
import models.Alumno;

import java.util.List;

public class EliminarClasesImpl implements EliminarClases {   //Este metodo elimina a un alumno con caracteristica unica
    @Override
    public List<Alumno> eliminarAlumnoConCursoUnico(List<Alumno> alumnos, String curso) {

        Alumno alumnoAEliminar = null;

        for (Alumno alumno: alumnos) {

            if(alumno.getCurso().equals(curso)){
                alumnoAEliminar=alumno;
            }
        }
        alumnos.remove(alumnoAEliminar);
        return alumnos;
    }

    @Override
    public List<Alumno> eliminarAlumnosConCurso(List<Alumno> alumnos, Alumno alumno) {
        alumnos.remove(alumno);
        return alumnos;
    }

    @Override
    public List<Alumno> eliminarListaDeAlumnosConCurso(List<Alumno> alumnos, List<Alumno> alumnosB) {

        for (Alumno alumno: alumnosB) {
            alumnos.remove(alumno);
        }
        return alumnos;
    }


}
