package Practica1;

public abstract class Empleado {
    protected String nombre;
    protected double sueldo;



    public Empleado(String nombre,double sueldo){
        this.nombre = nombre;
        this.sueldo = sueldo;
    }

    abstract double calcularPago();

    public void mostrarDatos(){
        System.out.println("Nombre: "+ nombre);
        System.out.println("Sueldo: " + sueldo);
    }

}
