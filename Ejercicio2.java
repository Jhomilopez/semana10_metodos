package com.example;

import java.util.Scanner;

public class Ejercicio2 {

    public void Calificación() {

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ejercicio 2: Sistema de Calificación Crediticia");

        System.out.print("Ingrese su edad: ");
        int edad = scanner.nextInt();

        System.out.print("Ingrese sus ingresos mensuales: ");
        double ingresos = scanner.nextDouble();

        System.out.print("Ingrese sus gastos mensuales: ");
        double gastos = scanner.nextDouble();

        boolean edadValida = edad >= 18 && edad <= 65;
        boolean ingresosValidos = ingresos >= 2000000;
        boolean gastosValidos = gastos <= ingresos * 0.70;

        if (edadValida && ingresosValidos && gastosValidos) {
            double creditoMaximo = ingresos * 5;
            System.out.println("Crédito aprobado.");
            System.out.println("Monto máximo del crédito: $" + creditoMaximo);
        } else {
            System.out.println("Crédito no aprobado. Motivos:");
            if (!edadValida) {
                System.out.println("- Edad fuera del rango permitido (18 a 65 años).");
            }
            if (!ingresosValidos) {
                System.out.println("- Ingresos mensuales insuficientes (mínimo $2,000,000).");
            }
            if (!gastosValidos) {
                System.out.println("- Gastos mensuales exceden el 70% de los ingresos.");
            }
        }
    }
}
