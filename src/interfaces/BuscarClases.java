package interfaces;

import models.Alumno;
import models.Paciente;

import java.util.List;

public interface BuscarClases {

    List<Alumno> buscarAlumnoPorApellido(List<Alumno> alumnos, String apellido);

    List<Alumno> buscarAlumnoPorCurso(List<Alumno> alumnos, String curso);

    Paciente buscarPacientePorCredencial(List <Paciente> tablaPacientes, int credencial);
}
