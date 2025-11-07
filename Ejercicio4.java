    package com.example; 
    
    public class Ejercicio4 {
        public void viaje() {

        int tomarBus = 20;
        int tomarMetro = 15;
        int salirCaminando = 10; 
        boolean trafico = true;
        boolean lluvia = flase;
        double nuevoTiempoBus = tomarBus;
        double nuevoTiempoCaminando = nuevoTiempoCaminando

        if (trafico) {
            nuevoTiempoBus = tomarBus * 1.5;
        }
        if (lluvia) {
            nuevoTiempoCaminando = nuevoTiempoCaminando * 2;
        } 
        double tiempoTotal = tiempoBusAjustado + tiempoMetro + tiempoCaminarAjustado;

        System.out.println("-----CALCULAR TIEMPO DE VIAJE-----");
        System.out.println("condiciones del dia");
        System.out.println("el trafico esta pesado?" + (trafico ? "si" : "no"));
        System.out.println("esta lloviendo?" + (lluvia ? "si" : "no"));
        System.out.println("el tiempo que toma el viaje es");
        System.out.println("en bus toma" + "nuevoTiempoBus" + "minutos");
        System.out.println("en el metro" + "tomaMetro" + "minutos");
        System.out.println("caminando nos demoramos " + "nuevoTiempoCaminando" + "minutos");
        System.out.println("el tiempo en total de viaje es " + "totalViaje" + "minutos");

        if (totalViaje >= 60) {
        int horas = (int) (tiempoTotal / 60);
        int minutos = (int) (tiempoTotal % 60);
        System.out.println("Equivale a: " + horas + " hora(s) y " + minutos + " minuto(s)");
}
  }
    }    

    