package interfaces;

import models.Alumno;
import models.Vendedor;

import java.util.List;

public interface ModificarClases {

    List<Alumno> modificarCodigo(List<Alumno> alumnos, int codigoViejo, int codigoNuevo);

    List<Alumno> modificarCodigoPorDni(List<Alumno> alumnos, int dni, int codigoViejo, int codigoNuevo);

    List<Vendedor> modificarBono(List<Vendedor> vendedors);
}
