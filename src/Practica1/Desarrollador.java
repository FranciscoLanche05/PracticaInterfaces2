package Practica1;

public class Desarrollador extends Empleado implements Bonificable {

    public Desarrollador(String nombre,double sueldo){
        super(nombre,sueldo);
    }

    @Override
    public double calcularBono() {
        return sueldo * 0.10;
    }

    @Override
    public double calcularPago() {
        return sueldo + calcularBono();
    }


    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Pago: " + calcularPago());
    }
}
