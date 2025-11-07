package com.example;

import java.util.Scanner;

ArrayList <vuelo> vuelos = new ArrayList<>();
Scanner scanner = new scanner(System.int);

public class ejercicio5 {

  vuelos.add (new vuelo (estado:"retraso", identificador "vuelo01", tiempo"0"));
  vuelos.add (new vuelo (estado:"retraso", identificador "vuelo02", tiempo"25"));
  vuelos.add (new vuelo (estado:"retraso", identificador "vuelo03", tiempo"51"));
  vuelos.add (new vuelo (estado:"retraso", identificador "vuelo04", tiempo"20"));
  vuelos.add (new vuelo (estado:"retraso", identificador "vuelo05", tiempo"2"));
}
public void clima (){
    System.out.print("cual es el estado del clima 1 bueno 2 malo ");
    int estadoClima == scanner.nextInt();
    if (estadoClima == 1) {
    System.out.print("no hay retrasos en los vuelos ");
    } else {
        System.out.print("el vuelo tendra un retraso de 30min + 0.30");
        for (int 1 = 0; i < 5; i++) {
            vuelo vuelo = vuelos.get(i);
            vuelo.sumarTiempo(30 + vuelo.getTiempo());
            System.out.print("vuelo" + vuelo.getIdentificador() + "tiene un retraso de" + vuelo.getTiempo());
        }
    }   scanner.close();
    return null;
}

class vuelo {
    private String estado;
    private String identificador;
    private double tiempo;

public vuelo (String estado, String identificador, double tiempo) {
    this.estado = estado;
    this.tiempo = tiempo;
    this.identificador = identificador;
}
public String getEstado() {
    return estado;
}
public String getTiempo() {
    return tiempo;
}
public String getIdentificador() {
    return identificador;
}
public void sumarTiempo(double tiempoNuevo) {
   this.tiempo = tiempoNuevo;
}
}