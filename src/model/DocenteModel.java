package model;

public class DocenteModel extends PersonaModel {

    private int salario;

    public DocenteModel() {

    }

    public DocenteModel(int salario) {
        this.salario = salario;
    }

    public DocenteModel(int salario, String nombre, String apellido, int edad) {
        super(nombre, apellido, edad);
        this.salario = salario;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "DocenteModel{" + "salario=" + salario + '}';
    }
}
