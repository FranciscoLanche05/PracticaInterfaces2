package Practica2;

public class Pato extends Animal implements Nadador{

    public Pato(String nombre){
        super(nombre);
    }

    @Override
    public void comer() {
        super.comer();
    }

    @Override
    public void nadar() {
        System.out.println("nada en el estanque");
    }
    public void hacerSonido(){
        System.out.println("Cuack");
    }
    public void info(){
        System.out.println("Nombre: " + nombre);
        hacerSonido();
        nadar();
        comer();
    }

}
