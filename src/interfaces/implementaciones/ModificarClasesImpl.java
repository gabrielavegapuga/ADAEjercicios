package interfaces.implementaciones;

import interfaces.ModificarClases;
import models.Alumno;
import models.Vendedor;

import java.util.ArrayList;
import java.util.List;

public class ModificarClasesImpl implements ModificarClases {
    @Override
    public List<Alumno> modificarCodigo(List<Alumno> alumnos, int codigoViejo, int codigoNuevo) {

        List<Alumno> codigoModificado = new ArrayList<>();

        for (Alumno alumno: alumnos) {
            if(alumno.getCodigoEstudiante()==codigoViejo){
                alumno.setCodigoEstudiante(codigoNuevo);
                codigoModificado.add(alumno);

            }
        }

        return codigoModificado;
    }

    @Override
    public List<Alumno> modificarCodigoPorDni(List<Alumno> alumnos, int dni, int codigoViejo, int codigoNuevo) {
        List<Alumno> AlumnosConcodigoModificado = new ArrayList<>();

        int digito=0;
        for (Alumno alumno: alumnos) {
            if (alumno.getDni()== dni && alumno.getCodigoEstudiante()==codigoViejo){
                digito++;
                alumno.setCodigoEstudiante(codigoNuevo + digito);
                AlumnosConcodigoModificado.add(alumno);
            }

        }


        return AlumnosConcodigoModificado;
    }

    @Override
    public List<Vendedor> modificarBono(List<Vendedor> vendedors) {
        List<Vendedor> vendedoresModificado = new ArrayList<>();
        for (Vendedor vendedor:vendedors) {
            if(vendedor.getSalario() < 1010){
                vendedor.setRecibeBono("SI");
                vendedor.setBono(50);
                vendedoresModificado.add(vendedor);
            }
        }

        return vendedoresModificado;
    }
}
