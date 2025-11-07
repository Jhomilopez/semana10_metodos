package com.example;

import java.util.Scanner;

public class ejercicio10 {
    public static void dia () {
    
       System.out.println("dia");

     Scanner scanner = new Scanner(System.in);      

        for (int dia = 1; dia <= 7; dia++) {
        System.out.println("/ndia" + dia); 


        System.out.println("Ingrese la humedad del suelo (%): ");
        double humedad = scanner.nexDouble();    
 
        System.out.println("Ingrese la temperatura (°c): ");
        double temperatura = scanner.nexDouble(); 

        System.out.println("¿llovio en las ultimas 24 horas? (si/no): ");
        String lluvia = scanner.next();   

        if (lluvia.equalsIngnoreCase("si")) {
            System.out.println("no se activa el riego (ha llovido)");

        }  else if (humedad < 30) {
            System.out.println("riego activado por 60 minutos");

        }    else if (temperatura > 25 && humedad < 50) {
            System.out.println("riego activado por 30 minutos");
    }   else {
        System.out.println("no se requiere riego");
    }
   }
}  
   }