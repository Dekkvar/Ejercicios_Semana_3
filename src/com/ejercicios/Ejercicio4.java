package com.ejercicios;
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner leer_entrada = new Scanner(System.in);
        String altString, baseString;
        System.out.println("Introduce la altura del rectángulo: ");
        altString = leer_entrada.nextLine();
        System.out.println("Introduce la base del rectángulo: ");
        baseString = leer_entrada.nextLine();

        int alt = Integer.parseInt(altString);
        int base = Integer.parseInt(baseString);
        int area = alt * base;

        if (alt == base) {
            System.out.println("Eso no es un rectángulo, es un cuadrado.");
        } else {
            System.out.println("El area de tu rectángulo es: " + area);
        }
    }
}
