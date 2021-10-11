package com.generation;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Estructura de control If
        /*if (condicion){

        }else if(){

        }else{

        }*/

        //Scanner permite recuperar contenido de consola
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa tu edad");
        //nextInt recupera el dato como si fuera un numero
        int edad = sc.nextInt();
        System.out.println("¿Cual es tu nombre?");
        //limpia el scanner para que pueda leerse más información
        sc.nextLine();
        //Se reutiliza sc
        String nombre = sc.nextLine();

        if (edad > 18) {
            System.out.println("Felicidades, "+ nombre+", puedes votar");
        } else {
            System.out.println("Hola, "+nombre+" Aun no puedes votar");
        }
        //El escaner debe cerrarse al terminar el ingreso de datos.
        sc.close();
    }
}
