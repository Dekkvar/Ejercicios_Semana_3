package com.ejercicios;
import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner leer_entrada = new Scanner(System.in);
        String ageString;
        System.out.println("Introduce tu edad: ");
        ageString = leer_entrada.nextLine();

        double age = Double.parseDouble(ageString);

        System.out.println(age >= 18);
    }
}
