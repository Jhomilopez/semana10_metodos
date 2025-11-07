package com.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Ejercicio2 ejercicio2 =new ejercicio2();
        Ejercicio3 ejercicio3 =new ejercicio3();
        Ejercicio4 ejercicio4 =new ejercicio4();
        Ejercicio5 ejercicio5 =new ejercicio5();
        Ejercicio6 ejercicio6 =new ejercicio6();
        Ejercicio7 ejercicio7 =new ejercicio7();
        Ejercicio8 ejercicio8 =new ejercicio8();
        Ejercicio9 ejercicio9 =new ejercicio9();
        Ejercicio10 ejercicio10 =new ejercicio10();


        Scanner scanner = new Scanner(System.in);
        while (true) {
            menu();
            int opcion = scanner.nextInt();

            if (opcion == 0) {
                break;
            }
            
            switch (opcion) {
                case 1:
                    ejercicio1();
                    break;
                case 2:
                System.out.println("Ejecundao ejercicio 2: ");
                ejercicio2.Calificación();
                    break;
                case 3:
                System.out.println("Ejecundao ejercicio 3: ");
                Ejercicio3.ingresos();
                    break;
                case 4:
                System.out.println("Ejecundao ejercicio 4: ");
                ejercicio4.viaje();
                    break;
                case 5:
                System.out.println("Ejecundao ejercicio 5: ");
                ejercicio5.clima();
                    break;
                case 6:
                System.out.println("Ejecundao ejercicio 6: ");
                ejercicio6.Entraga();
                    break;
                case 7:
                System.out.println("Ejecundao ejercicio 7: ");
                ejercicio7.Calorias();
                    break;
                case 8:
                System.out.println("Ejecundao ejercicio 8: ");
                ejercicio8.Temperatura();
                    break;
                case 9:
                System.out.println("Ejecundao ejercicio 9: ");
                ejercicio9.notas();
                    break;
                case 10:
                System.out.println("Ejecundao ejercicio 10: ");
                ejercicio10.dia();
                    break;
                default:
                    System.out.println("Opción Inválida");
            }

        }
    }
        System.out.println("Fin del programa");
        scanner.close();
    }

    public static void menu() {
        System.out.println("--------------------------------");
        System.out.println("Bienvenido a la aplicación de la semana 10");
        System.out.println("1. Ejercicio 1");
        System.out.println("2. Ejercicio 2: Calificación Crediticia");
        System.out.println("3. Ejercicio 3");
        System.out.println("4. Ejercicio 4");
        System.out.println("5. Ejercicio 5");
        System.out.println("6. Ejercicio 6");
        System.out.println("7. Ejercicio 7");
        System.out.println("8. Ejercicio 8");
        System.out.println("9. Ejercicio 9");
        System.out.println("10. Ejercicio 10");
        System.out.println("0. para salir");
        System.out.println("Selecciona una opción: ");
        System.out.println("--------------------------------");
    }

    public static void ejercicio1() {
        System.out.println("Ejercicio 1: Calculadora de descuentos en Tienda");
        double productos = 0;
    }

public static void Ejercicio2() {
    System.out.println("Ejercicio 2: Sistema de Calificación Crediticia");
}



public static void ejercicio2() {
    System.out.println("Ejercicio2.java");
}

    public static void ejercicio3() {
        System.out.println("Ejercicio 3");
    }

    public static void ejercicio4() {
        System.out.println("Ejercicio 4");
    }

    public static void ejercicio5() {
        System.out.println("Ejercicio 5");
    }

    public static void ejercicio6() {
        System.out.println("Ejercicio 6");
    }

    public static void ejercicio7() {
        System.out.println("Ejercicio 7");
    }

    public static void ejercicio8() {
        System.out.println("Ejercicio 8");
    }

    public static void ejercicio9() {
        System.out.println("Ejercicio 9");
    }

    public static void ejercicio10() {
        System.out.println("Ejercicio 10");
    }


