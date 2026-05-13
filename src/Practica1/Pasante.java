package Practica1;

public class Pasante extends Empleado {
    public Pasante(String nombre,double sueldo){
        super(nombre, sueldo);
    }

    @Override
    public double calcularPago() {
        return sueldo;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Pago: " + calcularPago());
    }
}
