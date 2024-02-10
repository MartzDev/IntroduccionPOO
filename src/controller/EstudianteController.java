package controller;

import model.EstudianteModel;

// herencia
public class EstudianteController extends PersonaController {

    EstudianteModel objeto_estudiante_model = new EstudianteModel();

    public void consultarEstudiante() {
        System.out.printf("""
                          NOMBRE DEL ESTUDIANTE: %s
                          APELLIDO DEL ESTUDIANTE: %s
                          EDAD DEL ESTUDIANTE: %s
                          PROMEDIO DEL ESTUDIANTE: %s
                          """, objeto_estudiante_model.getNombre(), objeto_estudiante_model.getApellido(),
                objeto_estudiante_model.getEdad(), objeto_estudiante_model.getPromedio());
    }

    public void actualizarEstudiante(String nombre, String apellido, int edad, double promedio) {
        objeto_estudiante_model.setNombre(nombre);
        objeto_estudiante_model.setApellido(apellido);
        objeto_estudiante_model.setEdad(edad);
        objeto_estudiante_model.setPromedio(promedio);
    }

    // polimorfismo: el estudiante reporta
    @Override
    public void reportar() {
//        super.reportar();
        System.out.println("ESTOY REPORTANDO DESDE EL CONTROLADOR ESTUDIANTE");
    }
}
