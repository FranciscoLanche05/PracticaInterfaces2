package Practica2;

public class Leon extends Animal {


    public Leon(String nombre){
        super(nombre);
    }
    public void hacerSonido(){
        System.out.println("Ruarrr");
    }
    @Override
    public void comer() {
        super.comer();
    }
    public void info(){
        System.out.println("Nombre: " + nombre);
        comer();
        hacerSonido();
    }
}
