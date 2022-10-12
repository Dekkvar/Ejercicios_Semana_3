package com.ejercicios;
import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        final double PI = 3.14159265359;
        Scanner leer_entrada = new Scanner(System.in);
        String radioString;
        System.out.println("Introduce el radio de tu circunferencia: ");
        radioString = leer_entrada.nextLine();

        double radio = Double.parseDouble(radioString);
        double area = PI * radio * radio;
        double large = 2 * PI * radio;

        System.out.println("El area de tu circunferencia es: " + area + "\nLa longitud de tu circunferencia es: " + large);
    }
}
