package model;

// herencia
public class EstudianteModel extends PersonaModel {

    private double promedio;

    public EstudianteModel() {
    }

    public EstudianteModel(double promedio) {
        this.promedio = promedio;
    }
    
    public EstudianteModel(int promedio, String nombre, String apellido, int edad) {
        super(nombre, apellido, edad);
        this.promedio = promedio;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    @Override
    public String toString() {
        return "EstudianteModel{" + "promedio=" + promedio + '}';
    }
}
