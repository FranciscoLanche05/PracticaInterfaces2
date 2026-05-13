package Practica2;

public abstract class Animal {

    protected String nombre;

    public Animal(String nombre){
        this.nombre = nombre;
    }

    public void comer(){
        System.out.println("Puede comer");
    }
    abstract void hacerSonido();

    abstract void info();
}
