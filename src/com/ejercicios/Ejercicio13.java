package com.ejercicios;
import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner leer_entrada = new Scanner(System.in);
        String numString;
        System.out.println("Introduce un número: ");
        numString = leer_entrada.nextLine();

        int num = Integer.parseInt(numString);

        for (int i = 1; i < 10; i++) {
            System.out.println(i + " * " + num + " = " + i * num);
        }
    }
}
