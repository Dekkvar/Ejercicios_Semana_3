package com.ejercicios;
import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner leer_entrada = new Scanner(System.in);
        String dat1, dat2;
        System.out.println("Introduce un dato: ");
        dat1 = leer_entrada.nextLine();
        System.out.println("Introduce otro dato: ");
        dat2 = leer_entrada.nextLine();

        if (dat1.equals(dat2)) {
            System.out.println("Los datos introducidos son iguales.");
        } else {
            System.out.println("Los datos introducidos son distintos.");
        }
    }
}
