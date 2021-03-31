package ejecutores;

import interfaces.*;
import interfaces.implementaciones.*;
import models.Alumno;
import models.Paciente;
import models.Vendedor;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        PoblarClases poblarClases = new PoblarClasesImpl();  //se llama a la interfaz y a la implementacion
        BuscarClases buscarClases = new BuscarClasesImpl();
        ModificarClases modificarClases = new ModificarClasesImpl();
        EliminarClases eliminarClases= new EliminarClasesImpl();
        IParaPacientes paraPacientes = new ParaPacientesImpl();

        List<Vendedor> vendedors = poblarClases.crearVendedores();
        System.out.println(vendedors);

        List<Vendedor> vendedoresConBono = modificarClases.modificarBono(vendedors);
        System.out.println(vendedoresConBono);




       // List<Paciente> pacientes =poblarClases.crearPacientes();
       // System.out.println(pacientes);

       // Paciente paciente= buscarClases.buscarPacientePorCredencial(pacientes, 989);
        //System.out.println(paraPacientes.atenderPaciente(paciente));


        //List<Alumno> alumnos = poblarClases.crearAlumnos();  //esta lista está trayendo los datos del poblar clases, a traves del metodo de esa interfaz

       // System.out.println(alumnos);


        //System.out.println(modificarClases.modificarCodigoPorDni(alumnos, 23, 0,0));

      //  System.out.println(buscarClases.buscarAlumnoPorApellido(alumnos, "Vega"));


        //System.out.println(buscarClases.buscarAlumnoPorCurso(alumnos, "Fisica"));  //Imprime los que tienen fisica



        //BORRAR A TODOS LOS QUE TENGAN "FISICA" (usando un metodo que recibe una sublista):

        //List<Alumno> alumnosABorrarFisica = buscarClases.buscarAlumnoPorCurso(alumnos, "Fisica"); //nueva lista que almacenará a los alumnos con dicha caracteristica

       // eliminarClases.eliminarListaDeAlumnosConCurso(alumnos, alumnosABorrarFisica);

       // System.out.println(alumnos);




      /*  //BORRAR A TODOS LOS QUE TENGAN "FISICA" (usando for each en el Main):

        List<Alumno> alumnosABorrarFisica = buscarClases.buscarAlumnoPorCurso(alumnos, "Fisica"); //nueva lista que almacenará a los alumnos con dicha caracteristica

        //Crear un for each para esa nueva lista:
        for (Alumno alumno: alumnosABorrarFisica) {
            eliminarClases.eliminarAlumnosConCurso(alumnos, alumno);

        }

        System.out.println(alumnos);*/



        //BORRAR AL PRIMERO CON GET(0)
      /* Alumno alumnoaBorrar = buscarClases.buscarAlumnoPorCurso(alumnos, "Fisica").get(0); //busca al primero que tiene fisica
        eliminarClases.eliminarAlumnosConCurso(alumnos, alumnoaBorrar);  //borrar al primero que tiene fisica.
        System.out.println(alumnos);*/




      //  System.out.println(modificarClases.modificarCodigo(alumnos, 789090, 1223));

       // System.out.println(eliminarClases.eliminarAlumnoConCursoUnico(alumnos, "Fisica2"));



       // alumnos.clear();
       // System.out.println(alumnos);
    }
}
