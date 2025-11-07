package com.example; 
    
public class Ejercicio6 {
    public void Entrega() {

    int horasTrabajo = 8;
    int tiempoTrabajoHora = 60; = horasTrabajo * 60;

    int zonaCentro = 30; 
    int zonaPeriferica = 45;
    int zonaRural = 60;
    
    int entregasCentro = 47;
    int entregasPeriferica = 10;
    int entregasRural = 3;

    int totalTiempoCentro = zonaCentro * entregasCentro;
    int totalTiempoPeriferico = zonaPeriferica * entregasPeriferica;
    int totalTiempoRural = zonaRural * entregasRural;
    int tiempoTotalZonas = totalTiempoCentro + totalTiempoPeriferico + totalTiempoRural;

    String conductor = "Juan carlos";

    System.out.println("-----OPTIMIZADOR DE RUTAS-----");
    System.out.println("entregas programadas");
    System.out.println("");
    System.out.println("el conductor elegido para esta tarea es" + conductor);
    System.out.println("");
    System.out.println("- zonaCentro" + entregasCentro + "Tardan" + zonaCentro + "minutos" + totalTiempoCentro + "minutos");
    System.out.println("-zona periferica:" + entregasPeriferica + "Tarda" + zonaPeriferica + "minutos" + "total tiempo" + totalTiempoPeriferico + "minutos");
    System.out.println("-zona rural:" + entregasRural + "Tarda" + zonaRural + "minutos" + "total tiempo" + totalTiempoRural + "minutos");
    System.out.println("total tiempo requerido para el trabajo" + tiempoTotalZonas + "minutos");
    System.out.println("el conductor debe cumplir con sus" + tiempoTrabajoHora + "minutos");


if (totalTiempototalZonas <= tiempoTrabajoHora) {
    int tiempoSobrante = tiempoTrabajoHora - tiempoTotalZonas;
    System.out.println("las entregas se pueden hacer el dia de hoy");
    System.out.println("tiempo sobrante:" + tiempoSobrante + "minutos");

    int entregasFaltantes = tiempoSobrante / zonaCentro;
    int entregasFaltantes2 = tiempoSobrante / zonaPeriferica;
    int entregasFaltantes3 = tiempoSobrante / zonaRural;
    System.out.println("entregasfaltantes Zona centro" + entregasfaltantes);
    System.out.println("entregasfaltantes Zona periferico" + entregasFaltantes2);
    System.out.println("entregasfaltantes Zona rural" + entregasFaltantes3);

} else{
    int tiempoFaltante = tiempoTotalZonas - tiempoTrabajoHora;
    System.out.println("no es posible entregar");
    System.out.println("hay un tiempo faltante de" + tiempoFaltante + "minutos");
    System.out.println("se debe programar");
}   



 }
}