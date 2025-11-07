package com.example;

import java.util.Scanner;

public class ejercicio9 {
    public static void notas (){
    
    System.out.println("notas");

     Scanner scanner = new Scanner(System.in);

     for (int i = 1; i <= 3; i++) {
        System.out.println("/nestudiantes" + i);

        System.out.println("Ingrese la nota de parciales (0-5): ");
        double parciales = scanner.nexDouble();

        System.out.println("Ingrese la nota del proyecto final (0-5): ");
        double proyecto = scanner.nexDouble();

        System.out.println("Ingrese la nota de participacion (0-5): ");
        double participacion = scanner.nexDouble();    

        double promdio = (parciales * 0.3) + (proyecto * 0.4) + (participacion * 0.3);

        String resultado;

        if (promedio >= 4.0) {
            resultado = "Aprueba";
        }  else if (promdio >= 3.5) {
            resultado = "va a supletorio";
        } else {
            resultado = "reprueba";
        }

        System.out.println("promedio final:" + promdio);
        System.out.println("resultado:" + resultado);
    }
  }
}