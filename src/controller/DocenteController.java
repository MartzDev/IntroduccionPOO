package controller;

import model.DocenteModel;

public class DocenteController extends PersonaController {

    DocenteModel objeto_docente_model = new DocenteModel();

    // metodo que consulta los datos del docente gracias a los getters
    public void consultarDocente() {
        System.out.printf("""
                          NOMBRE DEL DOCENTE: %s
                          APELLIDO DEL DOCENTE: %s
                          EDAD DEL DOCENTE: %s
                          SALARIO DEL DOCENTE: %s
                          """, objeto_docente_model.getNombre(), objeto_docente_model.getApellido(),
                objeto_docente_model.getEdad(), objeto_docente_model.getSalario());
    }

    // metodo que actualiza los datos del docente gracias a los setters
    public void actualizarDocente(String nombre, String apellido, int edad, String perfil, int salario) {
        objeto_docente_model.setNombre(nombre);
        objeto_docente_model.setApellido(apellido);
        objeto_docente_model.setEdad(edad);
        objeto_docente_model.setSalario(salario);
    }

    // polimorfismo: el docente reporta
    @Override
    public void reportar() {
        super.reportar();
        System.out.println("ESTOY REPORTANDO DESDE EL CONTROLADOR DOCENTE");
    }

}
