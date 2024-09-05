package INTROPOO.ActividadIntegradora.SistemdeGestion.modelos;

import java.util.List;

public class Empleado {
    private String nombre;
    private int edad;
    private double salario;
    private String departamento;

    public Empleado() {

    }

    public Empleado(String nombre, int edad, double salario, String departamento) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
        this.departamento = departamento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public void allEmpleados(Empleado[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {

        }
    }

    public static void imprimirTabla(List<Empleado> empleados) {
        System.out.printf("%-5s %-20s %-20s %-10s %-20s%n", "N°", "Nombre", "Edad", "Salario", "Departamento");

        for (int i = 0; i < empleados.size(); i++) {
            Empleado empleado = empleados.get(i);
            System.out.printf("%-5d %-20s %-20d %-10.2f %-20s%n", i + 1, empleado.getNombre(), empleado.getEdad(),
                    empleado.getSalario(), empleado.getDepartamento());
        }
    }

}