package com.example;

import java.util.Scanner;

public class ejercicio7 {
    public static void Calorias() {
        System.out.println("Calorias")

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese los minutos de cardio: ");
        int cardio = scanner.nextInt();

        System.out.print("Ingrese los minutos de pesa: ");
        int pesa = scanner.nextInt();

        System.out.print("Ingrese los minutos de yoga: ");
        int yoga = scanner.nextInt();

        int Calorias = (cardio * 10) + (pesa * 8) + (yoga * 5);
        int puntos = 0;

        if (Calorias > 500) {
            puntos = 50;
        }

        System.out.println("Calorias totales quedamas: " + Calorias);
    }    System.out.println("puntos ganados : " + puntos);
}