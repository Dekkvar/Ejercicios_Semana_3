package com.ejercicios;
import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner leer_entrada = new Scanner(System.in);
        String num1String, num2String;
        System.out.println("Introduce un número: ");
        num1String = leer_entrada.nextLine();
        System.out.println("Introduce otro número: ");
        num2String = leer_entrada.nextLine();

        double num1 = Double.parseDouble(num1String);
        double num2 = Double.parseDouble(num2String);
        double mod = num1%num2;

        System.out.println("El módulo de los números introducidos es: " + mod);
    }
}
