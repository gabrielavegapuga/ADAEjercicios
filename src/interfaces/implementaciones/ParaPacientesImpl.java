package interfaces.implementaciones;

import interfaces.IParaPacientes;
import models.Paciente;

public class ParaPacientesImpl implements IParaPacientes {
    @Override
    public String atenderPaciente(Paciente paciente) {

        String respuesta = " ";

        if(paciente==null) {
            respuesta = "Paciente no encontrado";

        }else {
            if (paciente.getServicioSocial() == null) {
                respuesta = "No lo voy a atender";

            } else {
                respuesta = paciente.toString();

            }
        }

        return respuesta;
    }
}
