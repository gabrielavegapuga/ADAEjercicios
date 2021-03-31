package interfaces.implementaciones;

import interfaces.BuscarClases;
import models.Alumno;
import models.Paciente;

import java.util.ArrayList;
import java.util.List;

public class BuscarClasesImpl implements BuscarClases {
    @Override
    public List<Alumno> buscarAlumnoPorApellido(List<Alumno> alumnos, String apellido) {

        List<Alumno> alumnosConEseApellido = new ArrayList<>();

        for (Alumno alumno: alumnos) {

            if(alumno.getApellido() ==apellido){
                alumnosConEseApellido.add(alumno);
            }

        }

        return alumnosConEseApellido;
    }

    @Override
    public List<Alumno> buscarAlumnoPorCurso(List<Alumno> alumnos, String curso) {

        List<Alumno> alumnosConEseCurso = new ArrayList<>();

        for (Alumno alumno: alumnos) {
            if(alumno.getCurso().equals(curso)){
                alumnosConEseCurso.add(alumno);
            }

        }

        return alumnosConEseCurso;
    }

    @Override
    public Paciente buscarPacientePorCredencial(List<Paciente> tablaPacientes, int credencial) {
        Paciente pacienteEncontrado = null;

        for (Paciente pacienteiterador: tablaPacientes) {

            if(pacienteiterador.getCredencial() == credencial){
                pacienteEncontrado=pacienteiterador;
            }
            
        }
        return pacienteEncontrado;
    }
}
