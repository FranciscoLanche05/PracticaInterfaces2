package Practica2;

public class Main {
    public static void main(String[] args){
        Animal aguila1 = new Aguila("Cometa");
        Animal leon1 = new Leon("Max");
        Animal pinguino1 = new Pinguino("Cabo");
        Animal pato1 = new Pato("Lucas");
        System.out.println("===================");
        System.out.println("==== AGUILAS ====");
        aguila1.info();

        System.out.println("===================");
        System.out.println("==== LEONES ====");
        leon1.info();

        System.out.println("===================");
        System.out.println("==== PINGUINOS =====");
        pinguino1.info();


        System.out.println("===================");

        pato1.info();

    }
}
