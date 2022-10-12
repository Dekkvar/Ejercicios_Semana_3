package com.ejercicios;
import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner leer_entrada = new Scanner(System.in);
        String dat1, dat2, dat3;
        System.out.println("Introduce un dato: ");
        dat1 = leer_entrada.nextLine();
        System.out.println("Introduce otro dato: ");
        dat2 = leer_entrada.nextLine();
        System.out.println("Introduce otro dato: ");
        dat3 = leer_entrada.nextLine();

        if (dat1.equals(dat2) && dat1.equals(dat3)) {
            System.out.println("Todos los datos introducios son iguales.");
        } else if (dat1.equals(dat2)) {
            System.out.println("El primer dato y el segundo dato introducidos son iguales.");
        } else if (dat1.equals(dat3)) {
            System.out.println("El primer dato y el tercer dato introducidos son iguales.");
        } else if (dat2.equals(dat3)) {
            System.out.println("El segundo dato y el tercer dato introducidos son iguales.");
        } else {
            System.out.println("Todos los datos introducidos son distintos.");
        }
    }
}
