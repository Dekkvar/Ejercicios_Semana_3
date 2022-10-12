package com.ejercicios;
import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner leer_entrada = new Scanner(System.in);
        String name, city, like;
        System.out.println("Introduce tu nombre: ");
        name = leer_entrada.nextLine();
        System.out.println("Introduce de donde eres: ");
        city = leer_entrada.nextLine();
        System.out.println("Introduce algo que te gusta hacer: ");
        like = leer_entrada.nextLine();

        System.out.println("Hola, mi nombre es " + name + ", soy de " + city + " y me gusta " + like + ".");
    }
}
