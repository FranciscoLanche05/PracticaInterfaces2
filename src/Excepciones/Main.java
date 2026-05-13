package Excepciones;


import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        int edad = 0;
        Scanner sc = new Scanner(System.in);
        Ejercicion1 eje = new Ejercicion1("Francisco");

        System.out.println("Ingrese su edad");
        while (true){
            try{
                edad = sc.nextInt();
                break;
            }catch (InputMismatchException e){
                System.out.println("Carcater no valido");
                sc.next();
            }

        }
        sc.close();
        System.out.println(eje.nombre +" Tu edad es: " + edad);



    }
}
