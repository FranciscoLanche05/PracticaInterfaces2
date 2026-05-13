package Practica1;

public class Main {
    public static void main(String[] args){

        Empleado gerente1 = new Gerente("Carlos", 2000);
        Empleado desarrollador1 = new Desarrollador("Manuel",1500);
        Empleado pasante1 = new Pasante("Mario",450);

        gerente1.mostrarDatos();
        desarrollador1.mostrarDatos();
        pasante1.mostrarDatos();
    }
}