package Practica2;

public class Aguila extends Animal implements Volador{

    public Aguila(String nombre){
        super(nombre);
    }

    @Override
    public void comer() {
        super.comer();
    }

    @Override
    public void volar() {
        System.out.println(nombre + "Vuela por las montañas");
    }

    public void hacerSonido(){
        System.out.println("Piiiio");
    }

    public void info(){
        System.out.println("Nombre: " + nombre);
        volar();
        hacerSonido();
    }
}
