package com.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        CamionDeReparto camion1 = new CamionDeReparto("C1", 100.0, 2000.0, true);
      System.out.println("Combustible inicial: " + camion1.getcombustible());

        camion1.viajar(60);
        System.out.println("Combustible restante: " + camion1.getcombustible());

        BuqueCarga buque1= new BuqueCarga("b2", 500.0, 10000.0, 50);
        buque1.atracarEnPuerto();
        buque1.mostrarDatos();

         System.out.println("--- Ejecutando Prueba de Fuego ---");
        camion1.setCombustible(-20);
        System.out.println("Resultado del Setter  " + camion1.getcombustible());

             System.out.println("---------------------------");

          ArrayList<Transporte> flota = new ArrayList<>();
          flota.add(camion1);
          flota.add(buque1);

          System.out.println("---viaje 100 km ---");

          for(Transporte t : flota){
            System.out.println("transporte" + t.getIdTransporte());
            t.viajar(100);
            System.out.println("-----------");
          }
    }
}