package view;

import controller.DocenteController;
import controller.EstudianteController;
import java.util.Scanner;

public class MainView {

    // scanner para el menu de opciones
    static Scanner objeto_scanner_opcion = new Scanner(System.in);

    // scanner para la solicitar los datos
    static Scanner objeto_scanner_datos = new Scanner(System.in);

    static EstudianteController objeto_estudiante_controller = new EstudianteController();
    static DocenteController objeto_docente_controller = new DocenteController();

    static String nombre;
    static String apellido;
    static int edad;
    static double promedio;
    static int salario;

    public static void main(String[] args) {

        while (true) {
            System.out.println("""
                           MENU OPCIONES
                           1. CONSULTAR ESTUDIANTE
                           2. ACTUALIZAR ESTUDIANTE
                           3. CONSULTAR DOCENTE
                           4. ACTUALIZAR DOCENTE
                           5. REPORTAR ESTUDIANTE
                           6. REPORTAR DOCENTE
                           7. SALIR DEL SISTEMA
                           """);

            System.out.print("INGRESE UNA OPCION: ");
            int opcion = objeto_scanner_opcion.nextInt();

            switch (opcion) {
                case 1 -> {
                    objeto_estudiante_controller.consultarEstudiante();
                }
                case 2 -> {
                    solicitarDatosEstudiante();
                    objeto_estudiante_controller.actualizarEstudiante(nombre, apellido, edad, promedio);
                    System.out.println("ESTUDIANTE ACTUALIZADO");
                }
                case 3 -> {
                    objeto_docente_controller.consultarDocente();
                }
                case 4 -> {
                    solicitarDatosDcoente();
                    objeto_docente_controller.actualizarDocente(nombre, apellido, edad, apellido, salario);
                    System.out.println("DOCENTE ACTUALIZADO");
                }
                case 5 -> {
                    objeto_estudiante_controller.reportar();
                }
                case 6 -> {
                    objeto_docente_controller.reportar();
                }
                case 7 -> {
                    System.out.println("THX, VUELVA PRONTO");
                    System.exit(0);
                }
                default ->
                    System.out.println("ERROR, LA OPCION INGRESADA NO EXISTE");
            }
        }
    }

    // metodo para solicitar datos al estudiante
    public static void solicitarDatosEstudiante() {
        System.out.print("INGRESE EL NOMBRE DEL ESTUDIANTE: ");
        nombre = objeto_scanner_datos.next();

        System.out.print("INGRESE EL APELLIDO DEL ESTUDIANTE: ");
        apellido = objeto_scanner_datos.next();

        System.out.print("INGRESE LA EDAD DEL ESTUDIANTE: ");
        edad = objeto_scanner_datos.nextInt();

        System.out.print("INGRESE EL PROMEDIO DEL ESTUDIANTE : ");
        promedio = objeto_scanner_datos.nextDouble();
    }

    // metodo para solicitar datos al docente
    public static void solicitarDatosDcoente() {

        System.out.print("INGRESE EL NOMBRE DEL DOCENTE: ");
        nombre = objeto_scanner_datos.next();

        System.out.print("INGRESE EL APELLIDO DEL DOCENTE: ");
        apellido = objeto_scanner_datos.next();

        System.out.print("INGRESE LA EDAD DEL DOCENTE: ");
        edad = objeto_scanner_datos.nextInt();

        System.out.print("INGRESE EL SALARIO DEL DOCENTE : ");
        salario = objeto_scanner_datos.nextInt();
    }
}
