package com.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
    CamionDeReparto camion = new CamionDeReparto("C1", 100.0, 2000.0, true);
    System.out.println("Combustible inicial: " + camion.getCombustible());

    camion.viajar(60);
    System.out.println("Combustible restante: " + camion.getCombustible());

    BuqueCarga buque = new BuqueCarga("b2", 500.0, 10000.0, 50);
        buque.atracarEnPuerto();
    buque.mostrarDatos();

    // Prueba de fuego
    System.out.println("--- Ejecutando Prueba de Fuego ---");
    camion.setCombustible(-20);
    System.out.println("Resultado del Setter  " + camion.getCombustible());
    
    // 3. Demostración de polimorfismo
    ArrayList<Transporte> flota = new ArrayList<>();
        flota.add(camion);
        flota.add(buque);

        System.out.println("\n--- Viaje de 100 km ---");

        for (Transporte t : flota) {
            t.viajar(100);
            System.out.println(
                    "ID: " + t.getIdTransporte() +
                    " | Combustible restante: " + t.getCombustible()
            );
        }

    }
}