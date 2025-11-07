package com.example;

import java.util.Scanner;

public class ejercicio8 {
    public static void Temperatura () {

     System.out.println("Temperatura");

     Scanner scanner = new Scanner(System.in);

     for (int i = 1; i <= 5; i++) {
        System.out.println("/npaciente" + i);

        System.out.println("Ingrese la temperatura (°c): ");
        double temperatura = scanner.nexDouble();

        System.out.println("Ingrese la presion sistolica: ");
        double sistolica = scanner.nextInt();   

        System.out.println("Ingrese la presion diastolica: ");
        double diastolica = scanner.nextInt();    

        System.out.println("Ingrese el nivel de dolor (1 al 10): ");
        double dolor = scanner.nextInt();   

        String clasificacion;

        if (temperatura > 38.5 ||  sistolica > 140 || diastolica > 90 || dolor >= 8) {
            clasificacion = "Urgente";
        } else if (temperatura >= 37.5 || dolor >= 5) {
            Calificacion = "prioritario";
        } else {
            clasificacion = "normal";
        }
        System.out.println("clasificacion de paciente: " + clasificacion);

     }
    }
}