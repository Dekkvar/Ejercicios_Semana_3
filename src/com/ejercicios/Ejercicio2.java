package com.ejercicios;

public class Ejercicio2 {
    public static void main(String[] args) {
        float radio = 5;
        final double PI = 3.14159265359;
        double area = PI * radio * radio;
        double large = 2 * PI * radio;

        System.out.println("El area de una circunferencia de radio 5 es: " + area + "\nLa longitud de una circunferencia de radio 5 es: " + large);
    }
}
