package interfaces.implementaciones;

import interfaces.PoblarClases;
import models.Alumno;
import models.Paciente;
import models.ServicioSocial;
import models.Vendedor;

import java.util.ArrayList;
import java.util.List;

public class PoblarClasesImpl implements PoblarClases {


    @Override
    public List<Alumno> crearAlumnos() {

        List<Alumno> alumnos = new ArrayList<>();

        Alumno juan = new Alumno("Juan", "Lopez", 23, 0, "Electricidad");
        Alumno ivana = new Alumno("Ivana", "Diaz", 23, 0, "Fisica");
        Alumno antonio = new Alumno("Antonio", "Lopez", 23, 789122, "Electricidad");
        Alumno andrea = new Alumno("Andrea", "Herrera", 23, 0, "Fisica2");
        Alumno martin = new Alumno("Martin", "Diaz", 23499, 788989, "Electricidad");
        Alumno ernesto = new Alumno("Ernesto", "Juarez", 23431, 789090, "Electricidad");
        Alumno gabriela = new Alumno("Gabriela", "Vega", 23678, 788777, "Fisica");
        Alumno daniela = new Alumno("Daniela", "Lopez", 23412, 789342, "Electricidad");
        Alumno roberto = new Alumno("Roberto", "Guzman", 23456, 789567, "Fisica");
        Alumno juana = new Alumno("Juana", "Gutierrez", 23534, 789678, "Fisica");
        Alumno gonzalo = new Alumno("Gonzalo", "Perez", 23897, 789778, "Electricidad");
        Alumno juanM = new Alumno("Juan", "Martinez", 23300, 789973, "Electricidad");

        alumnos.add(juan);
        alumnos.add(ivana);
        alumnos.add(antonio);
        alumnos.add(andrea);
        alumnos.add(martin);
        alumnos.add(ernesto);
        alumnos.add(gabriela);
        alumnos.add(daniela);
        alumnos.add(roberto);
        alumnos.add(juana);
        alumnos.add(gonzalo);
        alumnos.add(juanM);

        return alumnos;
    }

    @Override
    public List<Paciente> crearPacientes() {

        List<Paciente> pacientes = new ArrayList<>();


        ServicioSocial servicioSocial2 = new ServicioSocial("premium", 405);
        Paciente paciente = new Paciente("Sofia", "Gonzales", 990, 990, new ServicioSocial("Platinum", 200));
        Paciente paciente2 = new Paciente("Andrea", "Gonzales", 991, 991, servicioSocial2);
        Paciente paciente3 = new Paciente("Leticia", "Gonzales", 992, 992, new ServicioSocial("Platinum", 200));
        Paciente paciente4 = new Paciente("ana", "Gonzales", 993, 993, null);

        pacientes.add(paciente);
        pacientes.add(paciente2);
        pacientes.add(paciente3);
        pacientes.add(paciente4);

        return pacientes;
    }

    @Override
    public List<Vendedor> crearVendedores() {
        List<Vendedor> vendedores = new ArrayList<>();

        Vendedor vendedor1 = new Vendedor("Evelin", "Esquivel", 4444, 1, 1,900,1000, "NO", 0);
        Vendedor vendedor2 = new Vendedor("Gastón", "Perez", 4445, 2, 1,1000,1000, "NO", 0);
        Vendedor vendedor3 = new Vendedor("Carla", "Pietri", 4446, 3, 1,500,800, "NO", 0);
        vendedores.add(vendedor1);
        vendedores.add(vendedor2);
        vendedores.add(vendedor3);
        return vendedores;
    }


}
