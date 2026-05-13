package Practica1;

public class Gerente extends Empleado implements Bonificable {

    public Gerente (String nombre,double sueldo){
        super(nombre,sueldo);
    }

    public double calcularBono(){
        return sueldo *0.05;
    }

    @Override
    public double calcularPago(){
        return sueldo + calcularBono();
    }


    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Pago: " + calcularPago());
    }


}
