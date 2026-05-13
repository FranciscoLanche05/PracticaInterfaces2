package Practica2;

public class Pinguino extends Animal implements Nadador{

    public Pinguino(String nombre){
        super(nombre);
    }

    @Override
    public void comer() {
        super.comer();
    }

    public void hacerSonido(){
        System.out.println("piuuu piuuu");
    }
    @Override
    public void nadar() {
        System.out.println("nada en el artico");
    }

    public void info(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Sonido: " );
        hacerSonido();
        nadar();
        comer();
    }
}
