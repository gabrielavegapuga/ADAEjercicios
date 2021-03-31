package interfaces;

import models.Alumno;
import models.Paciente;
import models.Vendedor;

import java.util.List;

public interface PoblarClases {

    List<Alumno> crearAlumnos();

    List<Paciente> crearPacientes();

    List<Vendedor> crearVendedores();
}
